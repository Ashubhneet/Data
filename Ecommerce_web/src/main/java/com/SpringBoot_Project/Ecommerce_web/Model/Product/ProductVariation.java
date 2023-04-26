package com.SpringBoot_Project.Ecommerce_web.Model.Product;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
public class ProductVariation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantity_available;
    private Integer price;
    private String primary_image_name;
    private Boolean is_active;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;
}
