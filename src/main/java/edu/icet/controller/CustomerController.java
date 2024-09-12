package edu.icet.controller;

import edu.icet.dto.CollectionDto;
import edu.icet.dto.CustomerDto;
import edu.icet.service.CollectionService;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
@RequiredArgsConstructor
public class CustomerController {

    final CustomerService customerService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addCollection(@RequestBody CustomerDto customerDto){
        return customerService.addCustomer(customerDto);
    }
}
