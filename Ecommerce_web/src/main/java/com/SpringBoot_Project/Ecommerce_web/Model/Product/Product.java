package com.SpringBoot_Project.Ecommerce_web.Model.Product;

import com.SpringBoot_Project.Ecommerce_web.Model.Category.Category;
import com.SpringBoot_Project.Ecommerce_web.Model.User.Seller;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Boolean is_cancellable;
    private Boolean is_returnable;
    private String brand;
    private Boolean is_active;
    private Boolean is_delete;
    @ManyToOne
    @JoinColumn(name = "userSellerId")
    private Seller seller;
    @OneToMany(mappedBy = "product")
    private List<ProductVariation> productVariation;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;
}
