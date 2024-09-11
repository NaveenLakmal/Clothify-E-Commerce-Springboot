package edu.icet.service.impl;

import edu.icet.dto.StockDto;
import edu.icet.entity.Collection;
import edu.icet.entity.Stock;
import edu.icet.repository.CollectionRepository;
import edu.icet.repository.StockRepository;
import edu.icet.service.StockService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StockServiceImpl implements StockService {

    final ModelMapper modelMapper;
    final StockRepository stockRepository;
    @Override
    public boolean addStock(StockDto stockDto) {
        Stock stock = modelMapper.map(stockDto, Stock.class);
        return (stockRepository.save(stock)) != null;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<StockDto> getAll() {
        return null;
    }

    @Override
    public StockDto findOne(long id) {
        return null;
    }

    @Override
    public boolean updateStockById(long id, StockDto stockDto) {
        return false;
    }
}
