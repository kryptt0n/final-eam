package com.vs.spring.finalex.controllers;

import com.vs.spring.finalex.models.Reservation;
import com.vs.spring.finalex.repositories.ReservationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ReservationFormController {
    private final ReservationRepository reservationRepository;

    public ReservationFormController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @GetMapping("/listReservations")
    public String listReservations(Model model) {
        List<Reservation> reservations = reservationRepository.findAll();
        model.addAttribute("reservations", reservations);
        return "list-reservations";
    }

    @GetMapping("/reservationForm")
    public String showReservationForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "add-reservation";
    }

    @PostMapping("/reservationFormSubmit")
    public String submitReservationForm(Reservation reservation) {
        Reservation savedReservation = reservationRepository.save(reservation);
        return "list-reservations";
    }

}
