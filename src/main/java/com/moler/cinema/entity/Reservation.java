package com.moler.cinema.entity;

import javax.persistence.*;


@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer seatNumber;
    private Integer rowNumber;
    private Integer columnNumber;
    private Integer active;
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;
    @ManyToOne
    @JoinColumn(name = "hall_id")
    private Hall hall;

    public Reservation() {}



}
