package edu.icet.service.impl;

import edu.icet.dto.StockDto;
import edu.icet.entity.Collection;
import edu.icet.entity.Stock;
import edu.icet.repository.CollectionRepository;
import edu.icet.repository.StockRepository;
import edu.icet.service.StockService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class StockServiceImpl implements StockService {

    final ModelMapper modelMapper;
    final StockRepository stockRepository;
    @Override
    public boolean addStock(StockDto stockDto) {
        List<Stock> existStocks = stockRepository.findByProductId(stockDto.getProductId());


        if(existStocks.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("Stock with ID %s not found for product ID %s", stockDto.getId(), stockDto.getProductId()));
        }

        for (Stock existStock:existStocks) {
            if ((stockDto.getColor().equals(existStock.getColor())) && (stockDto.getSize().equals(existStock.getSize()) )) {
                existStock.setQty(existStock.getQty() + stockDto.getQty());
                return (stockRepository.save(existStock)) != null;

            }
        }

        Stock stock = modelMapper.map(stockDto, Stock.class);
        return (stockRepository.save(stock)) != null;

    }

    @Override
    public boolean delete(long id) {
        if(stockRepository.existsById(id)){
            stockRepository.deleteById(id);
            return true;
        }
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
