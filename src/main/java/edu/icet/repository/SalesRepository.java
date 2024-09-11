package edu.icet.repository;

import edu.icet.entity.Category;
import edu.icet.entity.Sales;
import org.springframework.data.repository.CrudRepository;

public interface SalesRepository extends CrudRepository<Sales,Long> {
}
