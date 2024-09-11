package edu.icet.service;

import edu.icet.dto.CollectionDto;
import edu.icet.dto.OrderDto;

import java.util.List;

public interface OrderService {

    boolean addOrder(OrderDto orderDto);



    boolean delete(long id);

    List<OrderDto> getAll();

    OrderDto findOne(long id);

    boolean updateCollectionById(long id,OrderDto orderDto);
}
