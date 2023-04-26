package com.hibernate2.hibernate_2;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import org.springframework.context.annotation.Primary;

@Entity
@Table(name = "card")
@PrimaryKeyJoinColumn(name = "id")
public class Credit_Card extends Payment{
    private String card_no;

    public String getCard_no() {
        return card_no;
    }

    public void setCard_no(String card_no) {
        this.card_no = card_no;
    }
}
