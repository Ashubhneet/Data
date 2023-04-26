package com.project.demo_project.Model;

import com.project.demo_project.Model.Customer;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int amount_paid;
    private LocalDate date_created;
    private String payment_method;
    private String customer_address_city;
    private String customer_address_state;
    private String customer_address_county;
    private String customer_address_address_line;
    private String customer_address_zip_code;
    private String customer_address_label;

    @ManyToOne
    @JoinColumn(name = "customerId",nullable = false)
    private Customer customer;
    @OneToMany(mappedBy = "orders")
    private List<OrderProduct> orderProductList;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount_paid() {
        return amount_paid;
    }

    public void setAmount_paid(int amount_paid) {
        this.amount_paid = amount_paid;
    }

    public LocalDate getDate_created() {
        return date_created;
    }

    public void setDate_created(LocalDate date_created) {
        this.date_created = date_created;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getCustomer_address_city() {
        return customer_address_city;
    }

    public void setCustomer_address_city(String customer_address_city) {
        this.customer_address_city = customer_address_city;
    }

    public String getCustomer_address_state() {
        return customer_address_state;
    }

    public void setCustomer_address_state(String customer_address_state) {
        this.customer_address_state = customer_address_state;
    }

    public String getCustomer_address_county() {
        return customer_address_county;
    }

    public void setCustomer_address_county(String customer_address_county) {
        this.customer_address_county = customer_address_county;
    }

    public String getCustomer_address_address_line() {
        return customer_address_address_line;
    }

    public void setCustomer_address_address_line(String customer_address_address_line) {
        this.customer_address_address_line = customer_address_address_line;
    }

    public String getCustomer_address_zip_code() {
        return customer_address_zip_code;
    }

    public void setCustomer_address_zip_code(String customer_address_zip_code) {
        this.customer_address_zip_code = customer_address_zip_code;
    }

    public String getCustomer_address_label() {
        return customer_address_label;
    }

    public void setCustomer_address_label(String customer_address_label) {
        this.customer_address_label = customer_address_label;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
