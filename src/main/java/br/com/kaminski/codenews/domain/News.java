package br.com.kaminski.codenews.domain;

import java.time.LocalDateTime;

public class News {

    private Long id;
    private User user;
    private String title;
    private Topic topic;
    private String body;
    private String urlImage;
    private LocalDateTime localDateTimePublication;

}
