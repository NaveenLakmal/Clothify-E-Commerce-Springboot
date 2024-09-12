package edu.icet.service.impl;

import edu.icet.dto.ProductDto;
import edu.icet.dto.StockDto;
import edu.icet.entity.Product;
import edu.icet.entity.Stock;
import edu.icet.repository.ProductRepository;
import edu.icet.repository.StockRepository;
import edu.icet.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    final ModelMapper modelMapper;
    final ProductRepository productRepository;

    @Override
    public boolean addProduct(ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        return (productRepository.save(product)) != null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<ProductDto> getAll() {
        return null;
    }

    @Override
    public ProductDto findOne(long id) {
        return null;
    }

    @Override
    public boolean updateCustomerById(long id, ProductDto productDto) {
        return false;
    }
}
