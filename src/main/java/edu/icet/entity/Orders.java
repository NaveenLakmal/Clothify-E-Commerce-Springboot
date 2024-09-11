package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;
//
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@Entity
//public class Orders {
//
//    @Id
//    @GeneratedValue(strategy =  GenerationType.IDENTITY)
//    private long id;
//
//    @Column()
//    private String status;
//
//    @Column()
//    private String phoneNumber;
//
//    @Column()
//    private String address;
//
//    @Column()
//    private String city;
//
//    @Column()
//    private double total;
//
//    @Column()
//    private long customerId;
//
//    @Column()
//    private Date date;
//
//    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL)
//    private Set<OrderStock> orderStocks = new HashSet<>();
//}

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    private String status = "";

    @Column()
    private String phoneNumber = "";

    @Column()
    private String address = "";

    @Column()
    private String city = "";

    @Column()
    private double total = 0.0;


    @Column()
    private Date date = new Date();

    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
    private List<OrderStock>orderStocks = new ArrayList<>();

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne(mappedBy = "orders",cascade = CascadeType.ALL)
    private Payment payment;
}
