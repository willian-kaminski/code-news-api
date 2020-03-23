package br.com.kaminski.codenews.controller;

import br.com.kaminski.codenews.controller.dto.NewsDto;
import br.com.kaminski.codenews.domain.News;
import br.com.kaminski.codenews.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    @RequestMapping("/news")
    public List<NewsDto> lisAll(){
        List<News> news = newsRepository.findAll();
        return NewsDto.convertNews(news);
    }
}
