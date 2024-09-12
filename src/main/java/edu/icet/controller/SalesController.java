package edu.icet.controller;

import edu.icet.dto.ProductDto;
import edu.icet.dto.SalesDto;
import edu.icet.service.ProductService;
import edu.icet.service.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales")
@CrossOrigin
@RequiredArgsConstructor
public class SalesController {

    final SalesService salesService;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addSales(@RequestBody SalesDto salesDto){
        return salesService.addSales(salesDto);
    }


}
