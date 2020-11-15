package br.com.isaccanedo.service;

import br.com.isaccanedo.domain.model.Invoice;

public interface SaleOrderService {

	Invoice getInvoiceData(int orderId);
}
