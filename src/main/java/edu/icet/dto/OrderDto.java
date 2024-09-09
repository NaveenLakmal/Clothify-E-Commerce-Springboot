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
    private String status = "";
    private String phoneNumber = "";
    private String address = "";
    private String city = "";
    private double total = 0.0;
    private long customerId = 0;
    private Date date = new Date();
    private List<OrderStockDto> orderStocks;
}

