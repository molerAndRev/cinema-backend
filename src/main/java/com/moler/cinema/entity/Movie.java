package com.moler.cinema.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String director;
    @Column(length = 6000)
    private String description;
    private Timestamp startTime;
    private Integer duration;
    private Boolean is3D;

    public Movie() {}


}
