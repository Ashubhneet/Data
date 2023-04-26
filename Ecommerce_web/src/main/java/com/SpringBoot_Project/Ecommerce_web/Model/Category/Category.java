package com.SpringBoot_Project.Ecommerce_web.Model.Category;

import com.SpringBoot_Project.Ecommerce_web.Model.Product.Product;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne(optional = true,fetch = FetchType.LAZY)
    @JoinColumn(name = "parentCategory",referencedColumnName = "id")
    private Category parent;

    @OneToMany(cascade = CascadeType.ALL,
    fetch = FetchType.LAZY)
    @JoinColumn(name = "parentCategory")
    private List<Category> child;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private List<Product> product;

}
//    @ManyToOne(optional = true, fetch = FetchType.LAZY)
//    @JoinColumn(name = "PARENTITEMID", referencedColumnName = "ITEMID")
//    private Item parent;
//
//    @OneToMany(
//            cascade = {CascadeType.ALL},
//            orphanRemoval = true,
//            fetch = FetchType.LAZY
//    )
//    @JoinColumn(name = "PARENTITEMID")
//    private List<Item> children;
