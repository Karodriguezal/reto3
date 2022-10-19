package com.reto.reto3.Repository;

import com.reto.reto3.Entities.Reservation;
import com.reto.reto3.Entities.Score;
import com.reto.reto3.Repository.CrudRepository.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {
    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll(){ return (List<Reservation>) reservationCrudRepository.findAll(); }
    public Optional<Reservation> getReservation(int id){
        return reservationCrudRepository.findById(id);
    }
    public Reservation save(Reservation r){
        return reservationCrudRepository.save(r);
    }
    public void delete(Reservation r){
        reservationCrudRepository.delete(r);
    }
}