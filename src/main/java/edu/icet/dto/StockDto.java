package edu.icet.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StockDto {


    private long id;
    private String color;
    private String size;
    private int qty;
    private double price;

    @NotNull(message = "ProductId cannot be null")
    private Long productId; // Reference to the Product entity
    private List<OrderStockDto> orderStocks; // Assuming you have an OrderStockDto class
    private List<CartDto> carts; // Assuming you have a CartDto class

}
