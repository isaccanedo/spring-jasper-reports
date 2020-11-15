package br.com.isaccanedo.domain.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
public class SaleOrderLine implements Serializable {

	@Id
	@GeneratedValue
	private int id;

	private double priceUnit;
	private double quantity;
	
	private double discount;
	private double amountTax;
	private String description;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private SaleOrder order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

}
