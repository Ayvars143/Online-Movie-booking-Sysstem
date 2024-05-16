package com.example.seatselectionmsbranchfeature.service;

import com.example.seatselectionmsbranchfeature.entity.Seats;

import java.util.List;
import java.util.Optional;

public interface SeatStructureService {

 public Seats createSeats(Seats seats);
 public List<Seats> getAllSeats() ;

 public Optional<Seats> getSeatsById(int id);

 public Seats updateSeats(int id, Seats updatedSeats);

 public void deleteSeats(int id);

}
