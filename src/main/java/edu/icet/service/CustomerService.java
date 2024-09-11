package edu.icet.service;

import edu.icet.dto.CollectionDto;
import edu.icet.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    boolean addCustomer(CustomerDto customerDto);

    boolean delete(long id);

    List<CustomerDto> getAll();

    CustomerDto findOne(long id);

    boolean updateCustomerById(long id,CustomerDto customerDto);
}
