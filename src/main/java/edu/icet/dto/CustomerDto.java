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
public class CustomerDto {
    private long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private List<OrderDto> orders;         // Assuming you have an OrderDto class
    private CartDto cart;                  // Assuming you have a CartDto class
    private List<BillingInfoDto> billingInfos; // Assuming you have a BillingInfoDto class
}
