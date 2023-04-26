package com.SpringBoot_Project.Ecommerce_web.Model.Order;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "orderProductId")
public class OrderStatus extends OrderProduct {
    private String from_status;
    private String to_status;
    private String transition_notes_comments;
    private LocalDate transition_date;
}
