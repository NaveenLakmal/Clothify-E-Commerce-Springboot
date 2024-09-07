package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
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

    @Column()
    private long productId;

    @OneToMany(mappedBy = "stock",cascade = CascadeType.ALL)
    private Set<OrderStock> orderStocks = new HashSet<>();


}
