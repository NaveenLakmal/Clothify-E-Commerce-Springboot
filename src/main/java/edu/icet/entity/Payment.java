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
public class Payment {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column()
    private String paymentMethod;

    @Column()
    private String paymentStatus;

    @Column()
    private double total;

    @OneToOne()
    @JoinColumn(name = "order_id")
    private Orders orders;
}
