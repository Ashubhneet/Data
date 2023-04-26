package com.SpringBoot_Project.Ecommerce_web.Model.Order;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity;
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Orders orders;

}
