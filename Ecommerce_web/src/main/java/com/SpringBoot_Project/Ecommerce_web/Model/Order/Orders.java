package com.SpringBoot_Project.Ecommerce_web.Model.Order;

import com.SpringBoot_Project.Ecommerce_web.Model.Customer.Customer;
import lombok.*;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer amount_paid;
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
}
