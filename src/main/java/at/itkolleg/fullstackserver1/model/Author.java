package at.itkolleg.fullstackserver1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

    private int id;
    private String name;
    private String label;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    @Id
    public int getId() {
        return id;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(int id) {
        this.id = id;
    }

}
