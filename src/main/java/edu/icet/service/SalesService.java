package edu.icet.service;

import edu.icet.dto.ProductDto;
import edu.icet.dto.SalesDto;

import java.util.List;

public interface SalesService {

    boolean addSales(SalesDto salesDto);



    boolean delete(long id);

    List<SalesDto> getAll();

    SalesDto findOne(long id);

    boolean updateSalesById(long id,SalesDto salesDto);

}
