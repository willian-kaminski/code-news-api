package br.com.kaminski.codenews.domain.dto;

import br.com.kaminski.codenews.domain.News;

import java.time.LocalDateTime;

public class NewsDetailDto {

    private Long id;
    private String user;
    private String topic;
    private String title;
    private String body;
    private String urlImage;
    private LocalDateTime localDateTimePublication;

    public NewsDetailDto(News news) {
        this.id = news.getId();
        this.topic = news.getTopic().getName();
        this.title = news.getTitle();
        this.body = news.getBody();
        this.user = news.getUser().getName();
        this.urlImage = news.getUrlImage();
        this.localDateTimePublication = news.getLocalDateTimePublication();
    }

    public Long getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getUser() {
        return user;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public LocalDateTime getLocalDateTimePublication() {
        return localDateTimePublication;
    }
}
