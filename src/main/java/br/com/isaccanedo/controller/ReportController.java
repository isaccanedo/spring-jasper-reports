package br.com.isaccanedo.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isaccanedo.domain.entities.Product;
import br.com.isaccanedo.service.ProductService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@RestController
@RequestMapping("/api")
public class ReportController {

	@Autowired
	private ProductService productService;


	@GetMapping(path = "/report/products")
	public ResponseEntity<?> generateProductReport(HttpServletResponse response)
			throws JRException, IOException {
		List<Product> products = productService.getAll();
		File file = ResourceUtils.getFile("classpath:reports/products.jrxml");
		JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(products);
		Map<String, Object> parameters = new HashMap<>();
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);

		response.setContentType("application/pdf");

		response.setHeader("Content-Disposition", "inline; filename=products.pdf");

		final ServletOutputStream outputStream = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, outputStream);
		return new ResponseEntity<>(HttpStatus.OK);
	}


}
