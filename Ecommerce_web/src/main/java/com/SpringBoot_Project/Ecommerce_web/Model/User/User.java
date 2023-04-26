package com.SpringBoot_Project.Ecommerce_web.Model.User;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String firstName;
    private String middleName;
    private String lastName;
    private String password;
    private Boolean isActive;
    private Boolean isDelete;
    private Boolean isExpired;
    private Boolean isLocked;
    private Integer invalidAttemptCount;
    private LocalDate passwordUpdateDate;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "userRole",
            joinColumns = @JoinColumn(name = "userId",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "roleId",referencedColumnName = "id"))
    private List<Role> role;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Address> address;
}


