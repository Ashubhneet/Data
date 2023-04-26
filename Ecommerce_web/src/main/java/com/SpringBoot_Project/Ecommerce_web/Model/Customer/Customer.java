package com.SpringBoot_Project.Ecommerce_web.Model.Customer;

import com.SpringBoot_Project.Ecommerce_web.Model.Order.Orders;
import com.SpringBoot_Project.Ecommerce_web.Model.User.User;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "userId")
public class Customer extends User {
    private Long contact;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;
    private boolean isActive;

}
