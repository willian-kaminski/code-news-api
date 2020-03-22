package br.com.kaminski.codenews.controller;

import br.com.kaminski.codenews.controller.dto.TopicDto;
import br.com.kaminski.codenews.domain.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topicos")
    public List<TopicDto> lis(){
        Topic topic = new Topic((long) 1, "Corona");
        return TopicDto.convertTopic(Arrays.asList(topic, topic));
    }
}
