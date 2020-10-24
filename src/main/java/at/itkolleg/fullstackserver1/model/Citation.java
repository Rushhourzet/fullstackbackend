package at.itkolleg.fullstackserver1.model;

import javax.persistence.*;

@Entity
public class Citation {
    private int id;
    private String citation;
    @ManyToOne
    private Author author;

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

    public void setAuthor(Author author) {
        this.author = author;
    }
}
