package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
    private long id;
    private String paymentMethod;
    private String paymentStatus;
    private double total;
    private long orderId; // Reference to the Orders entity
}
