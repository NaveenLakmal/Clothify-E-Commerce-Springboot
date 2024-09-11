package edu.icet.service;

import edu.icet.dto.CartDto;
import edu.icet.dto.CollectionDto;

import java.util.List;

public interface CartService {
    boolean addCart(CartDto cartDto);

    boolean delete(long id);

    List<CartDto> getAll();

    CartDto findOne(long id);

    boolean updateCartById(long id,CartDto cartDto);
}
