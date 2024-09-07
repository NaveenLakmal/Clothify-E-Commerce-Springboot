package edu.icet.repository;

import edu.icet.entity.Collection;
import edu.icet.entity.Stock;
import org.springframework.data.repository.CrudRepository;

public interface StockRepository extends CrudRepository<Stock,Long> {
}
