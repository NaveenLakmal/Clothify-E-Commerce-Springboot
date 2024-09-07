package edu.icet.service;

import edu.icet.dto.CollectionDto;
import edu.icet.dto.OrderDto;

public interface OrderService {

    boolean addOrder(OrderDto orderDto);
}
