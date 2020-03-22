package br.com.kaminski.codenews.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "topics")
public class Topic {

    private static final long serialVersionUID = -1905907502453138175L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private LocalDateTime localDateTimePublication;

    public Topic() {
    }

    public Topic(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getLocalDateTimePublication() {
        return localDateTimePublication;
    }

    public void setLocalDateTimePublication(LocalDateTime localDateTimePublication) {
        this.localDateTimePublication = localDateTimePublication;
    }
}
