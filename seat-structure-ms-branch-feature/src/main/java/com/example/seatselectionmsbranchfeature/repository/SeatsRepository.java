package com.example.seatselectionmsbranchfeature.repository;

import com.example.seatselectionmsbranchfeature.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatsRepository extends JpaRepository<Seats,Integer> {

}
