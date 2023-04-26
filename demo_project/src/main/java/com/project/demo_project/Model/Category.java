package com.project.demo_project.Model;

import javax.persistence.*;
import java.util.List;

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
