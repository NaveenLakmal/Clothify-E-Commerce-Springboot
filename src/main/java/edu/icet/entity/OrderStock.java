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
public class OrderStock {

   @EmbeddedId
   private OrderStockId id;

   @ManyToOne
   @MapsId("orderId")
   @JoinColumn(name = "order_id")
   private Orders orders;

   @ManyToOne
   @MapsId("stockId")
   @JoinColumn(name = "stock_id")
    private Stock stock;


    @Column()
    private int quantity;
}
