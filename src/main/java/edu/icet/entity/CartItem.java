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
public class CartItem {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column()
    private int qty;

    @Column()
    private double unitPrice;

    @Column()
    private double total;

    @ManyToOne()
    @JoinColumn(name = "stock_id")
    private Stock stock;

    @ManyToOne()
    @JoinColumn(name = "cart_id")
    private Cart cart;
}
