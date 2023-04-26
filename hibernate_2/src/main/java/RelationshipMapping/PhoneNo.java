package RelationshipMapping;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "phone_no")
public class PhoneNo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String no;
    private String type;
    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer customer;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
