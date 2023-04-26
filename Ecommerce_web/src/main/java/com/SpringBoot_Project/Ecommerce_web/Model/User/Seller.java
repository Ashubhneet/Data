package com.SpringBoot_Project.Ecommerce_web.Model.User;

import com.SpringBoot_Project.Ecommerce_web.Model.Product.Product;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "userId")
public class Seller extends User {
    private String gst;
    private Long companyContact;
    private String companyName;
    @OneToMany(mappedBy = "seller")
    private List<Product> product;

}
