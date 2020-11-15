package br.com.isaccanedo.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
public class SaleOrder implements Serializable {

	@Id
    @GeneratedValue
	private int id;
	
	private String reference;
    private String origin;
    private LocalDateTime orderDate;
    private LocalDateTime validityDate;
    
    private double amountTotal;
    private double amountTax;
    private double amountUntaxed;
}
