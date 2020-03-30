package br.com.kaminski.codenews.domain.dto;

import br.com.kaminski.codenews.domain.Topic;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

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

    public static List<TopicDto> convertTopic(List<Topic> topics) {
        return topics.stream().map(TopicDto::new).collect(Collectors.toList());
    }

}
