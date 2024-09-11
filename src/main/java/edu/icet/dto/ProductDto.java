package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private long id;
    private String productName;
    private String description;
    private double price;
    private int soldCount;
    private String imageUrl;
    private long collectionId;  // Reference to the Collection entity
    private long categoryId;    // Reference to the Category entity
    private SalesDto sales;     // Assuming you have a SalesDto class
    private List<StockDto> stocks; // Assuming you have a StockDto class
}
