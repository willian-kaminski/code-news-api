package br.com.kaminski.codenews.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;
    private String title;

    @ManyToOne
    private Topic topic;

    private String body;
    private String urlImage;
    private LocalDateTime localDateTimePublication;

}
