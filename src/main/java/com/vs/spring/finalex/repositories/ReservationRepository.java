package com.vs.spring.finalex.repositories;

import com.vs.spring.finalex.models.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}
