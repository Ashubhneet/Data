package com.SpringBoot_Project.Ecommerce_web.Model.Product;

import com.SpringBoot_Project.Ecommerce_web.Model.Customer.Customer;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "product_review")
public class ProductReview {

    @EmbeddedId
    private ProductReviewId productReviewId=new ProductReviewId();

    @ManyToOne
    @MapsId("customerUserId")
    private Customer customer;

    @ManyToOne
    @MapsId("productId")
    private Product product;
    @Column(nullable = false)
    private String review;
    @Column(nullable = false)
    private Integer rating;

        @Embeddable
        public static class ProductReviewId implements Serializable {
        private static final Long serialVersionUID = 1L;
        private Long customerUserId;
        private Long product_id;
        }

}
