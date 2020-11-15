package br.com.isaccanedo.domain.model;

import java.util.List;

import br.com.isaccanedo.domain.entities.SaleOrder;
import br.com.isaccanedo.domain.entities.SaleOrderLine;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Invoice {
	
	private SaleOrder order;
	private List<SaleOrderLine> lines;

}
