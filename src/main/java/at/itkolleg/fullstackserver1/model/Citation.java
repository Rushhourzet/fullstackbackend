package at.itkolleg.fullstackserver1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Citation {
    private int id;
    private String citation;
    private int auth_id;

    @Id
    public int getId() {
        return id;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(int id) {
        this.id = id;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public int getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(int auth_id) {
        this.auth_id = auth_id;
    }
}
