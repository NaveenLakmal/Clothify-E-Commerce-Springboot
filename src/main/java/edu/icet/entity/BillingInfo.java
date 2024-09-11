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
public class BillingInfo {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @OneToOne()
    @JoinColumn(name = "order_id")
    private Orders orders;

    @OneToOne()
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
