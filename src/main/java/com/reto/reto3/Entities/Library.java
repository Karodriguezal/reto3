package com.reto.reto3.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Library")
public class Library implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String target;
    private Integer capacity;
    private String description;
    private String messages;
    private String reservations;

    @ManyToOne
    @JoinColumn(name ="CategoryId")
    @JsonIgnoreProperties("Libraries")
    private Category Category;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "Library")
    @JsonIgnoreProperties({"Library","Messages"})
    public List<Reservation> Reservations;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "Library")
    @JsonIgnoreProperties({"Library","Client"})
    public List<Message> Messages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getCapacity() { return capacity; }

    public void setCapacity(Integer capacity) { this.capacity = capacity; }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        Messages = messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public String getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        Reservations = reservations;
    }

    public void setReservations(String reservations) {
        this.reservations = reservations;
    }

    public com.reto.reto3.Entities.Category getCategory() {
        return Category;
    }

    public void setCategory(com.reto.reto3.Entities.Category category) {
        Category = category;
    }
}
