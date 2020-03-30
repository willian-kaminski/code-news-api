package br.com.kaminski.codenews.domain.dto;

import br.com.kaminski.codenews.domain.News;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class NewsDto {

    private Long id;
    private String title;
    private String body;
    private Long user_id;
    private LocalDateTime localDateTimePublication;

    public NewsDto(News news) {
        this.id = news.getId();
        this.title = news.getTitle();
        this.body = news.getBody();
        this.user_id = news.getUser().getId();
        this.localDateTimePublication = news.getLocalDateTimePublication();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public Long getUser_id() {
        return user_id;
    }

    public LocalDateTime getLocalDateTimePublication() {
        return localDateTimePublication;
    }

    public static List<NewsDto> convertNews(List<News> news) {
        return news.stream().map(NewsDto::new).collect(Collectors.toList());
    }
}
