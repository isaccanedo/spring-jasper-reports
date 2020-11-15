package br.com.isaccanedo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaccanedo.domain.entities.SaleOrder;

public interface SaleOrderRepository extends JpaRepository<SaleOrder, Integer>{

}
