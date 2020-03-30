package br.com.kaminski.codenews.controller;

import br.com.kaminski.codenews.domain.dto.TopicDto;
import br.com.kaminski.codenews.controller.form.TopicForm;
import br.com.kaminski.codenews.domain.Topic;
import br.com.kaminski.codenews.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/topics")
public class TopicController {

    private TopicService topicService;

    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @GetMapping
    public List<TopicDto> listAll(){
        return topicService.listAll();
    }

    @PostMapping
    public ResponseEntity<TopicDto> register(@RequestBody TopicForm topicForm){
        Topic topic = topicService.register(topicForm);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(new TopicDto(topic));
    }

}