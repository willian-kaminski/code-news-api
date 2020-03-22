package br.com.kaminski.codenews.domain;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String number;
    private String password;
    private boolean valid;

    @ManyToOne
    private Address address;

}
