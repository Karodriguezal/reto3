package com.reto.reto3.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "score")
public class Score implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idScore;
    private String messageText;
    private String stars;

    @OneToOne
    @JsonIgnoreProperties("score")
    private Reservation Reservation;

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    public com.reto.reto3.Entities.Reservation getReservation() {
        return Reservation;
    }

    public void setReservation(com.reto.reto3.Entities.Reservation reservation) {
        Reservation = reservation;
    }
}
