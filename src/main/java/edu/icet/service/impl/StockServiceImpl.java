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
}
