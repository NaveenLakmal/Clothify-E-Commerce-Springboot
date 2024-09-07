package edu.icet.repository;

import edu.icet.entity.Collection;
import edu.icet.entity.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders,Long> {
}
