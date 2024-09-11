package edu.icet.service;

import edu.icet.dto.CollectionDto;
import edu.icet.dto.SalesDto;
import edu.icet.dto.StockDto;

import java.util.List;

public interface StockService {

    boolean addStock(StockDto stockDto);

    boolean delete(long id);

    List<StockDto> getAll();

    StockDto findOne(long id);

    boolean updateStockById(long id,StockDto stockDto);
}
