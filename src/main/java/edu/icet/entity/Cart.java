package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column()
    private double unitPrice;

    @Column()
    private double grandPrice;

    @Column()
    private int qty;

    @ManyToOne()
    @JoinColumn(name = "stock_id")
    private Stock stock;


    @OneToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
