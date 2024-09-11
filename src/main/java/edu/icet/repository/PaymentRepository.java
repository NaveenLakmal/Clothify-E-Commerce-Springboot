package edu.icet.repository;

import edu.icet.entity.Category;
import edu.icet.entity.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment,Long> {
}
