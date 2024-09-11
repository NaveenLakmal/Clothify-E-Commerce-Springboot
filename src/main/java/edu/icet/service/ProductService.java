package edu.icet.service;

import edu.icet.dto.CustomerDto;
import edu.icet.dto.ProductDto;
import edu.icet.dto.StockDto;

import java.util.List;

public interface ProductService {
    boolean addProduct(ProductDto productDto);



    boolean delete(long id);

    List<ProductDto> getAll();

    ProductDto findOne(long id);

    boolean updateCustomerById(long id,ProductDto productDto);
}
