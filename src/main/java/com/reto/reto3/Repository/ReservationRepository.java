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
    private static ReservationCrudRepository ReservationCrudRepository;

    public List<Reservation> getAll(){ return (List<Reservation>) ReservationCrudRepository.findAll(); }
    public static Optional<Reservation> getReservation(int id){
        return ReservationCrudRepository.findById(id);
    }
    public static Reservation save(Reservation r){
        return ReservationCrudRepository.save(r);
    }
    public void delete(Reservation r){
        ReservationCrudRepository.delete(r);
    }
}