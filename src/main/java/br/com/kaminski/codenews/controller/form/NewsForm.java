package br.com.kaminski.codenews.controller.form;

import br.com.kaminski.codenews.domain.News;
import br.com.kaminski.codenews.domain.Topic;
import br.com.kaminski.codenews.domain.User;

public class NewsForm {

    private String title;
    private String body;
    private String urlImage;
    private Long topic_id;
    private Long user_id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Long getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Long topic_id) {
        this.topic_id = topic_id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public News convert(NewsForm newsForm, Topic topic, User user) {
        return new News(newsForm.getTitle(), newsForm.getBody(), newsForm.getUrlImage(), topic, user);
    }
}
