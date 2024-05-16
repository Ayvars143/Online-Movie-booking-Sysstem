package com.example.seatselectionmsbranchfeature.service;

import com.example.seatselectionmsbranchfeature.entity.Seats;
import com.example.seatselectionmsbranchfeature.repository.SeatsRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class SeatStructureServiceImpl implements SeatStructureService {

    @Autowired
    private SeatsRepository seatsRepository;

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public Seats createSeats(Seats seats) {
        return seatsRepository.save(seats);
    }

    @Override
    public List<Seats> getAllSeats() {
        return seatsRepository.findAll();
    }

    @Override
    public Optional<Seats> getSeatsById(int id) {
        return seatsRepository.findById(id);
    }

    @Override
    public Seats updateSeats(int id, Seats updatedSeats) {
        Seats existingSeats = seatsRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Seats ID"));

        existingSeats.setScreenId(updatedSeats.getScreenId());
        existingSeats.setCustomerArray(updatedSeats.getCustomerArray());

        return seatsRepository.save(existingSeats);
    }

    @Override
    public void deleteSeats(int id) {
        seatsRepository.deleteById(id);
    }
}