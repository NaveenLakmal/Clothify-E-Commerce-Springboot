package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillingInfoDto {
    private long id;
    private long orderId;    // Assuming you just need the order ID
    private long paymentId;  // Assuming you just need the payment ID
    private long customerId; // Assuming you just need the customer ID
}
