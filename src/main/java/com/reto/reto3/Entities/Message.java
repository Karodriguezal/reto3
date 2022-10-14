package com.reto.reto3.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Message")
public class Message implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "LibraryId")
    @JsonIgnoreProperties({"Messages, Reservations"})
    private Library Library;

    @ManyToOne
    @JoinColumn(name = "ClientId")
    @JsonIgnoreProperties({"Messages","Reservations"})
    private Client Client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
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
}
