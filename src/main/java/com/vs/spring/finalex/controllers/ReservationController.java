package com.vs.spring.finalex.controllers;

import com.vs.spring.finalex.models.Reservation;
import com.vs.spring.finalex.repositories.ReservationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private final ReservationRepository reservationRepository;

    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @PostMapping
    public ResponseEntity<Reservation> createReservation(@RequestBody Reservation reservation) {
        Reservation savedReservation = reservationRepository.save(reservation);
        return ResponseEntity.ok(savedReservation);
    }

    @GetMapping()
    public ResponseEntity<List<Reservation>> getReservation() {
        return ResponseEntity.ok(reservationRepository.findAll());
    }
}
