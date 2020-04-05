package br.com.kaminski.codenews.domain.form;

import br.com.kaminski.codenews.domain.Topic;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class TopicForm {

    @NotNull
    @NotEmpty
    @Length(min = 3)
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
