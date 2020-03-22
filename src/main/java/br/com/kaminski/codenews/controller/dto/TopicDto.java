package br.com.kaminski.codenews.controller.dto;

import br.com.kaminski.codenews.domain.Topic;

import java.time.LocalDateTime;

public class TopicDto {

    private Long id;
    private String name;
    private LocalDateTime localDateTimePublication;

    public TopicDto(Topic topic) {
        this.id = topic.getId();
        this.name = topic.getName();
        this.localDateTimePublication = topic.getLocalDateTimePublication();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getLocalDateTimePublication() {
        return localDateTimePublication;
    }

}
