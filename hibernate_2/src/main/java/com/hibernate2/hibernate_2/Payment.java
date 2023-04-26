package com.hibernate2.hibernate_2;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Payment {
    @Id
    private int id;
    private Double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

//    @Override
//    public String toString() {
//        return "Payment{" +
//                "id=" + id +
//                ", amount=" + amount +
//                '}';
//    }
}
