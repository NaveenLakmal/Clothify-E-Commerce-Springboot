package edu.icet.service.impl;

import edu.icet.dto.CustomerDto;
import edu.icet.entity.Collection;
import edu.icet.entity.Customer;
import edu.icet.repository.CollectionRepository;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    final ModelMapper modelMapper;
    final CustomerRepository customerRepository;
    @Override
    public boolean addCustomer(CustomerDto customerDto) {
        Customer customer = modelMapper.map(customerDto, Customer.class);

        return (customerRepository.save(customer)) != null;
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
