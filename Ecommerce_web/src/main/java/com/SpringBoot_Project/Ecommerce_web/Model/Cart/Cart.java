package com.SpringBoot_Project.Ecommerce_web.Model.Cart;

import com.SpringBoot_Project.Ecommerce_web.Model.Customer.Customer;
import com.SpringBoot_Project.Ecommerce_web.Model.Product.ProductVariation;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {

    @EmbeddedId
    private CartId id = new CartId();

    @ManyToOne
    @MapsId("customerUserId")
    private Customer customer;

    @ManyToOne
    @MapsId("productVariationId")
    private ProductVariation productVariation ;

    @Column(nullable = false)
    private Integer quantity;

    @Embeddable
    public static class CartId implements Serializable   {
        private static final Long serialVersionUID = 1L;
        private Long customerUserId;
        private Long productVariationId;

    }
}

