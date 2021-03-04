package it.bitsrl.scuola.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Corso {

    @Id
    private int id;
    private String title;
    @OneToMany(mappedBy="corso")
    private Set<EdizioneCorso> ec;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<EdizioneCorso> getEc() {
        return ec;
    }

    public void setEc(Set<EdizioneCorso> ec) {
        this.ec = ec;
    }
}
