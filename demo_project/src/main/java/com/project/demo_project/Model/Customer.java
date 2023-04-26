package com.project.demo_project.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@PrimaryKeyJoinColumn(name = "userId")
public class Customer extends User{
    private Long contact;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;

    public Long getContact() {
        return contact;
    }

    public void setContact(Long contact) {
        this.contact = contact;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
