package com.SpringBoot_Project.Ecommerce_web.Model.User;

import com.SpringBoot_Project.Ecommerce_web.Model.User.User;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;

    @ManyToMany(mappedBy = "role")
    private List<User> user;

}
