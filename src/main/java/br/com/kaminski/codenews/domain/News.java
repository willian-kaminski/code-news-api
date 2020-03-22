package br.com.kaminski.codenews.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "news")
public class News {

    private static final long serialVersionUID = -1905907502453138175L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String title;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    private String body;
    private String urlImage;
    private LocalDateTime localDateTimePublication;

}
