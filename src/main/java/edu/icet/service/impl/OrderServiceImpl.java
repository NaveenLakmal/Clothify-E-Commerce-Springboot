package edu.icet.service.impl;

import edu.icet.dto.OrderDto;
import edu.icet.dto.OrderStockDto;
import edu.icet.entity.OrderStock;
import edu.icet.entity.Orders;
import edu.icet.entity.Stock;
import edu.icet.repository.OrderRepository;
import edu.icet.repository.StockRepository;
import edu.icet.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    final ModelMapper modelMapper;
    final OrderRepository orderRepository;
    final StockRepository stockRepository;

    @Override
    @Transactional
    public boolean addOrder(OrderDto orderDto) {

        Orders order = new Orders();
        order.setStatus(orderDto.getStatus());
        order.setPhoneNumber(orderDto.getPhoneNumber());
        order.setCity(orderDto.getCity());
        order.setTotal(orderDto.getTotal());
        order.setDate(orderDto.getDate());
        order.setAddress(orderDto.getAddress());
       // order.setCustomerId(orderDto.getCustomerId());

        List<OrderStock> orderStocks=new ArrayList<>();

       // List<OrderStock> orderStocks1 = orderDto.getOrderStocks();


        for (OrderStockDto orderStockDto:orderDto.getOrderStocks()) {

            Stock stock=stockRepository.findById(orderStockDto.getStockId()).orElseThrow(() -> new RuntimeException("Stock not found with id: " + orderStockDto.getStockId()));

        OrderStock orderStock=new OrderStock();
        orderStock.setStock(stock);
        orderStock.setOrders(order);
        orderStock.setQuantity(orderStockDto.getQuantity());
        orderStocks.add(orderStock);

        stock.setQty(stock.getQty()-orderStockDto.getQuantity());
        stockRepository.save(stock);




        }

        order.setOrderStocks(orderStocks);
        orderRepository.save(order);
        return true;

    }

   /* public boolean addOrder(OrderDto orderDto) {

        Orders order = modelMapper.map(orderDto, Orders.class);

        if (order.getOrderStocks() == null) {
            order.setOrderStocks(new HashSet<>());
        }

        for (OrderStock orderStock : orderDto.getOrderStocks()) {
            Stock stock = stockRepository.findById(orderStock.getStock().getId())
                    .orElseThrow(() -> new RuntimeException("Stock not found"));

            // Create and set the composite key
            OrderStockId orderStockId = new OrderStockId(order.getId(), stock.getId());
            orderStock.setId(orderStockId);

            // Set the relationships
            orderStock.setOrders(order);
            orderStock.setStock(stock);

            // Add to the order's set of orderStocks
            order.getOrderStocks().add(orderStock);

            // Update stock quantity (optional, depending on your business logic)
            stock.setQty(stock.getQty() - orderStock.getQuantity());
            stockRepository.save(stock);
        }

        // Save the order
        return orderRepository.save(order) != null;


    }*/


}
