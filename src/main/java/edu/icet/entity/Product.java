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
public class Product {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long id;

    @Column()
    private String productName;

    @Column()
    private String description;

    @Column()
    private double price;

    @Column()
    private int soldCount;

    @Column()
    private String imageUrl;

    @ManyToOne()
    @JoinColumn(name = "collection_id")
    private Collection collection;

    @ManyToOne()
    @JoinColumn(name = "category_id")
    private Category category;

//    @OneToOne(mappedBy = "product")
//    private Product product;



}
