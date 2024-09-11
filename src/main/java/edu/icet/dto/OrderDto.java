package edu.icet.dto;

import edu.icet.entity.OrderStock;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//public class OrderDto {
//
//
//    private String status;
//
//
//    private String phoneNumber;
//
//
//    private String address;
//
//
//    private String city;
//
//
//    private double total;
//
//
//    private long customerId;
//
//
//    private Date date;
//
//    private Set<OrderStock> orderStocks = new HashSet<>();
//}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
    private long id;
    private String status;
    private String phoneNumber;
    private String address;
    private String city;
    private double total;
    private Date date;
    private List<OrderStockDto> orderStocks; // Assuming you have an OrderStockDto class
    private long customerId;                  // Storing only the customer ID
    private PaymentDto payment;               // Assuming you have a PaymentDto class
}

