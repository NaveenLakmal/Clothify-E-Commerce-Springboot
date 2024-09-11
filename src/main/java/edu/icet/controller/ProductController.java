package edu.icet.controller;

import edu.icet.dto.ProductDto;
import edu.icet.dto.StockDto;
import edu.icet.service.ProductService;
import edu.icet.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin
@RequiredArgsConstructor
public class ProductController {

    final ProductService productService;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addProduct(@RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }
}
