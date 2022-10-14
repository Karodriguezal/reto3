package com.reto.reto3.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Reservation")
public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status = "created";

    @ManyToOne
    @JoinColumn(name = "LibraryId")
    @JsonIgnoreProperties("Reservations")
    private Library Library;

    @ManyToOne
    @JoinColumn(name = "ClientId")
    @JsonIgnoreProperties({"Reservations","Messages"})
    private Client Client;

    @OneToOne
    @JsonIgnoreProperties("Reservation")
    private Score Score;

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public com.reto.reto3.Entities.Library getLibrary() {
        return Library;
    }

    public void setLibrary(com.reto.reto3.Entities.Library library) {
        Library = library;
    }

    public com.reto.reto3.Entities.Client getClient() {
        return Client;
    }

    public void setClient(com.reto.reto3.Entities.Client client) {
        Client = client;
    }

    public com.reto.reto3.Entities.Score getScore() {
        return Score;
    }

    public void setScore(com.reto.reto3.Entities.Score score) {
        Score = score;
    }
}
