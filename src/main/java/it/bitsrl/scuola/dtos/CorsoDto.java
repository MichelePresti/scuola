package it.bitsrl.scuola.dtos;

import it.bitsrl.scuola.entities.Corso;
import it.bitsrl.scuola.entities.EdizioneCorso;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CorsoDto {

    private int id;
    private String title;
    private Set<EdizioneCorsoDto> ec;

    public CorsoDto(Corso c){
        this.id = c.getId();
        this.title = c.getTitle();
        this.ec = c.getEc().stream().map(EdizioneCorsoDto::new).collect(Collectors.toSet());
    }

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

    public Set<EdizioneCorsoDto> getEc() {
        return ec;
    }

    public void setEc(Set<EdizioneCorsoDto> ec) {
        this.ec = ec;
    }
}
