package br.com.isaccanedo.service;

import java.util.List;

import br.com.isaccanedo.domain.entities.SaleOrderLine;

public interface SaleOrderLineService {
	 List<SaleOrderLine> getAllByOrderId(int orderId);
}
