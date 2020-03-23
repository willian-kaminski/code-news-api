package br.com.kaminski.codenews.controller;

import br.com.kaminski.codenews.controller.dto.TopicDto;
import br.com.kaminski.codenews.domain.Topic;
import br.com.kaminski.codenews.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @RequestMapping("/topics")
    public List<TopicDto> lis(){
        List<Topic> topics = topicRepository.findAll();
        return TopicDto.convertTopic(topics);
    }

}