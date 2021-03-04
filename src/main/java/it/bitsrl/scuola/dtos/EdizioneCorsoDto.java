package it.bitsrl.scuola.dtos;

import it.bitsrl.scuola.entities.EdizioneCorso;

import java.time.LocalDate;
import java.util.Objects;

public class EdizioneCorsoDto {

    private int id;
    private LocalDate start;
    private int idCourse;
    private String titleCourse;

    public EdizioneCorsoDto(EdizioneCorso ec){
        this.id = ec.getId();
        this.start = ec.getStart();
        this.idCourse = ec.getCorso().getId();
        this.titleCourse = ec.getCorso().getTitle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EdizioneCorsoDto that = (EdizioneCorsoDto) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getTitleCourse() {
        return titleCourse;
    }

    public void setTitleCourse(String titleCourse) {
        this.titleCourse = titleCourse;
    }
}
