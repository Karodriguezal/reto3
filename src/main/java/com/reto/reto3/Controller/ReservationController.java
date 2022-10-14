package com.reto.reto3.Controller;

import com.reto.reto3.Entities.Reservation;
import com.reto.reto3.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    private ReservationService ReservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return ReservationService.getAll();
    }

    @PostMapping("/save")
    public Reservation save(@RequestBody Reservation r){
        return ReservationService.save(r);
    }
}