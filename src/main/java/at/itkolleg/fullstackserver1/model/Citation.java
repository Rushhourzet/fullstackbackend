package at.itkolleg.fullstackserver1.model;

import javax.persistence.*;

@Entity
public class Citation {
    private Long cit_id;
    private String citation;
    @ManyToOne
    @JoinColumn(name="author_uid")
    private Author author;

    @Id
    public Long getCit_id() {
        return cit_id;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setCit_id(Long id) {
        this.cit_id = id;
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
