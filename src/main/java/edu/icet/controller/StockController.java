package edu.icet.controller;

import edu.icet.dto.CollectionDto;
import edu.icet.dto.StockDto;
import edu.icet.service.CollectionService;
import edu.icet.service.OrderService;
import edu.icet.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/stock")
@CrossOrigin
@RequiredArgsConstructor
public class StockController {

    final StockService stockService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addStock(@RequestBody StockDto stockDto){
        return stockService.addStock(stockDto);
    }

    @DeleteMapping("delete/{id}")
    public  boolean deleteStockById(@PathVariable int id){
        return stockService.delete(id);
    }
}
