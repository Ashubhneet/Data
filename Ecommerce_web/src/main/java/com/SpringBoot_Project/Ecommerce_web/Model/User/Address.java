package com.SpringBoot_Project.Ecommerce_web.Model.User;

import com.SpringBoot_Project.Ecommerce_web.Model.User.User;
import lombok.*;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String state;
    private String country;
    private String addressLine;
    private Long zipCode;
    private String lable;
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
}
