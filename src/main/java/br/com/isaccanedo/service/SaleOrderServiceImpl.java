package br.com.isaccanedo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.isaccanedo.domain.entities.SaleOrder;
import br.com.isaccanedo.domain.model.Invoice;
import br.com.isaccanedo.repositories.SaleOrderRepository;


@Service
public class SaleOrderServiceImpl implements SaleOrderService {

	
	@Autowired
	SaleOrderRepository saleOrderRepository; 
	
	@Autowired
	SaleOrderLineService saleOrderLineService; 
	
	
	public Invoice getInvoiceData(int orderId) {
		Invoice invoice = new Invoice();
		
		try {
			SaleOrder order = saleOrderRepository.getOne(orderId);
			if(order != null) {
				invoice.setOrder(order);
				invoice.setLines(saleOrderLineService.getAllByOrderId(orderId));
			} 
			return invoice;
		}catch(Exception ex) {
			return null;
		}
	}
	
}
