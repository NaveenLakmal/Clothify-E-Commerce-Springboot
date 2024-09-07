package edu.icet.controller;

import edu.icet.dto.OrderDto;
import edu.icet.dto.StockDto;
import edu.icet.service.OrderService;
import edu.icet.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
@RequiredArgsConstructor
public class OrderController {

    final OrderService orderService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addOrder(@RequestBody OrderDto orderDto){
        return orderService.addOrder(orderDto);
    }
}
