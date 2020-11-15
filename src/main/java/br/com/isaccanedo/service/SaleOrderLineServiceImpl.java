package br.com.isaccanedo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.isaccanedo.domain.entities.SaleOrder;
import br.com.isaccanedo.domain.entities.SaleOrderLine;
import br.com.isaccanedo.repositories.SaleOrderLineRepository;

@Service
public class SaleOrderLineServiceImpl implements SaleOrderLineService {

	@Autowired
	SaleOrderLineRepository repository; 
	
	public List<SaleOrderLine> getAllByOrderId(int orderId){
		SaleOrder saleOrder = new SaleOrder();
		saleOrder.setId(orderId);
		return repository.findByOrder(saleOrder);
	}
}
