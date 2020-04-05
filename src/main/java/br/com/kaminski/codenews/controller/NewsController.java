package br.com.kaminski.codenews.controller;

import br.com.kaminski.codenews.domain.dto.NewsDetailDto;
import br.com.kaminski.codenews.domain.form.NewsForm;
import br.com.kaminski.codenews.domain.News;
import br.com.kaminski.codenews.domain.dto.NewsDto;
import br.com.kaminski.codenews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/news")
public class NewsController {

    private NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping
    public List<NewsDto> listAll(){
        return newsService.listAll();
    }

    @PostMapping
    public ResponseEntity<NewsDto> register(@RequestBody NewsForm form){
        News news = newsService.register(form);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().build().toUri();
        return ResponseEntity.created(uri).body(new NewsDto(news));
    }

    @GetMapping("/{id}")
    public NewsDetailDto detail(@PathVariable Long id){
        return newsService.detail(id);
    }

}
