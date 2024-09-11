package edu.icet.service.impl;

import edu.icet.dto.CartDto;
import edu.icet.service.CartService;
import edu.icet.service.CategoryService;

import java.util.List;

public class CartServiceImpl implements CartService {
    @Override
    public boolean addCart(CartDto cartDto) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public List<CartDto> getAll() {
        return null;
    }

    @Override
    public CartDto findOne(long id) {
        return null;
    }

    @Override
    public boolean updateCartById(long id, CartDto cartDto) {
        return false;
    }
}
