package at.itkolleg.fullstackserver1.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Author {
    private Long uid;
    private String name;
    private String role;
    @OneToMany
    private Set<Citation> citations;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String label) {
        this.role = label;
    }


    @Id
    public Long getUid() {
        return uid;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setUid(Long id) {
        this.uid = id;
    }

}
