package br.com.isaccanedo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.isaccanedo.domain.entities.SaleOrderLine;
import br.com.isaccanedo.domain.entities.SaleOrder;
import java.util.List;

public interface SaleOrderLineRepository extends JpaRepository<SaleOrderLine, Integer> {

	List<SaleOrderLine> findByOrder(SaleOrder order);
}
