package br.com.kaminski.codenews.controller.form;

import br.com.kaminski.codenews.domain.Topic;

public class TopicForm {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic convert(TopicForm topicForm) {
        return new Topic(topicForm.getName());
    }
}
