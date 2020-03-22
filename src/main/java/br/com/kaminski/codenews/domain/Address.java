package br.com.kaminski.codenews.domain;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;

    @ManyToOne
    private Neighborhood neighborhood;

    @ManyToOne
    private City city;

    @ManyToOne
    private State state;

    @ManyToOne
    private Country country;

    private Double latitude;
    private Double longtude;

}
