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
public class Sales {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column()
    private double totalPrice;

    @Column()
    private int totalQty;

//    @OneToOne(mappedBy = "sales",cascade = CascadeType.ALL)
//    @JoinColumn(name = "product_id")
//    private Product product;


}
