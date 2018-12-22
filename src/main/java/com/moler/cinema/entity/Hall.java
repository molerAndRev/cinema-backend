package com.moler.cinema.entity;

import javax.persistence.*;

@Entity
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer numberOfRows;
    private Integer numberOfColumns;
    private Integer available;

    public Hall() {}

}
