package edu.icet.service.impl;

import edu.icet.dto.OrderDto;
import edu.icet.entity.OrderStock;
import edu.icet.entity.Orders;
import edu.icet.entity.Stock;
import edu.icet.repository.CollectionRepository;
import edu.icet.repository.OrderRepository;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    final ModelMapper modelMapper;
    final OrderRepository orderRepository;
    @Override

    public boolean addOrder(OrderDto orderDto) {
        Orders orders = modelMapper.map(orderDto, Orders.class);
//        return (orderRepository.save(orders)) != null;

        for (OrderStock orderStock: orders.getOrderStocks() ) {
            orderStock.setOrders(orders);
        }
        System.out.println("hello Object"+orders.getAddress());
        return (orderRepository.save(orders)) != null;
    }
}
