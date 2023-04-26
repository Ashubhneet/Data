package RelationshipMapping;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<PhoneNo> nos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<PhoneNo> getNos() {
        return nos;
    }

    public void setNos(Set<PhoneNo> nos) {
        this.nos = nos;
    }

    public void addPhoneNo(PhoneNo no){
        if(no!=null){
            if(nos==null){
                nos = new HashSet<>();
            }
            no.setCustomer(this);
            nos.add(no);

        }
    }
}
