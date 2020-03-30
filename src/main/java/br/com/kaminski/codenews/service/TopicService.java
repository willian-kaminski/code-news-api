package br.com.kaminski.codenews.service;

import br.com.kaminski.codenews.controller.form.TopicForm;
import br.com.kaminski.codenews.domain.Topic;
import br.com.kaminski.codenews.domain.dto.TopicDto;
import br.com.kaminski.codenews.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    private TopicRepository topicRepository;

    @Autowired
    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    public List<TopicDto> listAll(){
        List<Topic> topics = topicRepository.findAll();
        return TopicDto.convertTopic(topics);
    }

    public Topic register(TopicForm topicForm){
        Topic topic = topicForm.convert(topicForm);
        topicRepository.save(topic);
        return topic;
    }

}
