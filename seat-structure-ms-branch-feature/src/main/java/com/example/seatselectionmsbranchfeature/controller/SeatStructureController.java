package com.example.seatselectionmsbranchfeature.controller;

import com.example.seatselectionmsbranchfeature.entity.Seats;
import com.example.seatselectionmsbranchfeature.service.SeatStructureService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/seats")
public class SeatStructureController {

    @Autowired
    private SeatStructureService seatsService;

    @PostMapping("/add")
    public Seats createSeats(@RequestBody Seats seats) {
        return seatsService.createSeats(seats);
    }

    @GetMapping("/getAllSeats")
    public List<Seats> getAllSeats() {
        return seatsService.getAllSeats();
    }

    @GetMapping("/getSeat/{id}")
    public Optional<Seats> getSeatsById(@PathVariable int id) {
        return seatsService.getSeatsById(id);
    }

    @PutMapping("/updateSeat/{id}")
    public Seats updateSeats(@PathVariable int id, @RequestBody Seats updatedSeats) {
        return seatsService.updateSeats(id, updatedSeats);
    }

    @DeleteMapping("/deleteSeat/{id}")
    public void deleteSeats(@PathVariable int id) {
        seatsService.deleteSeats(id);
    }
}

