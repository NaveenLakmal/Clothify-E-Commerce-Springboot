package edu.icet.repository;

import edu.icet.entity.Cart;
import edu.icet.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart,Long> {
}
