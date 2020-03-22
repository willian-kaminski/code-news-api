package br.com.kaminski.codenews.domain;

import java.time.LocalDateTime;

public class Topic {

    private Long id;
    private String name;
    private LocalDateTime localDateTimePublication;

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
