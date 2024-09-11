package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {
    private long id;
    private double unitPrice;
    private double grandPrice;
    private int qty;
    private long stockId;        // Reference to the Stock entity
    private long customerId;     // Reference to the Customer entity
}
