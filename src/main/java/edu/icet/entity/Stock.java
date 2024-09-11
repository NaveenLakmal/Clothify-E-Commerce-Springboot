package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column()
    private String color;

    @Column()
    private String size;

    @Column()
    private int qty;

    @Column()
    private double price;



    @ManyToOne()
    @JoinColumn(name = "product_id",insertable = false,updatable = false)
    private Product product;

    @OneToMany(mappedBy = "stock",cascade = CascadeType.ALL)
    private List<OrderStock>orderStocks = new ArrayList<>();

    @OneToMany(mappedBy = "stock",cascade = CascadeType.ALL)
    private List<Cart> carts;

    // private Set<OrderStock> orderStocks;
//    private Set<OrderStock> orderStocks = new HashSet<>();


}
