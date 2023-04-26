package com.project.demo_project.Model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "orderProductId")
public class OrderStatus extends OrderProduct {
    private String from_status;
    private String to_status;
    private String transition_notes_comments;
    private LocalDate transition_date;

    public String getFrom_status() {
        return from_status;
    }

    public void setFrom_status(String from_status) {
        this.from_status = from_status;
    }

    public String getTo_status() {
        return to_status;
    }

    public void setTo_status(String to_status) {
        this.to_status = to_status;
    }

    public String getTransition_notes_comments() {
        return transition_notes_comments;
    }

    public void setTransition_notes_comments(String transition_notes_comments) {
        this.transition_notes_comments = transition_notes_comments;
    }

    public LocalDate getTransition_date() {
        return transition_date;
    }

    public void setTransition_date(LocalDate transition_date) {
        this.transition_date = transition_date;
    }
}
