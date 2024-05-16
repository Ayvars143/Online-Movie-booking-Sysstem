package com.example.seatselectionmsbranchfeature.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true, value = {"hibernateLazyInitializer", "handler"})

public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private int id;

    @Column(name = "screen_id")
    private int screenId;
    @Column(name = "movie_name")
    private String name;
    @Column(name = "movie_language")
    private String language;

    @Column(name = "movie_description")
    private String description;

}
