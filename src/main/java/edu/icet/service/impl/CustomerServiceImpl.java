package edu.icet.service.impl;

import edu.icet.dto.CustomerDto;
import edu.icet.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public boolean addCustomer(CustomerDto customerDto) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<CustomerDto> getAll() {
        return null;
    }

    @Override
    public CustomerDto findOne(long id) {
        return null;
    }

    @Override
    public boolean updateCustomerById(long id, CustomerDto customerDto) {
        return false;
    }
}
