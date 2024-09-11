package edu.icet.repository;

import edu.icet.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository <Product,Long> {
}
