package br.com.kaminski.codenews.service;

import br.com.kaminski.codenews.controller.form.NewsForm;
import br.com.kaminski.codenews.domain.News;
import br.com.kaminski.codenews.domain.Topic;
import br.com.kaminski.codenews.domain.User;
import br.com.kaminski.codenews.domain.dto.NewsDto;
import br.com.kaminski.codenews.repository.NewsRepository;
import br.com.kaminski.codenews.repository.TopicRepository;
import br.com.kaminski.codenews.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private NewsRepository newsRepository;
    private TopicRepository topicRepository;
    private UserRepository userRepository;

    @Autowired
    public NewsService(NewsRepository newsRepository, TopicRepository topicRepository, UserRepository userRepository) {
        this.newsRepository = newsRepository;
        this.topicRepository = topicRepository;
        this.userRepository = userRepository;
    }

    public List<NewsDto> listAll(){
        List<News> news = newsRepository.findAll();
        return NewsDto.convertNews(news);
    }

    public News register(NewsForm newsForm){
        Topic topic = topicRepository.findById(newsForm.getTopic_id()).orElseThrow(() -> new RuntimeException("Topic not found."));
        User user = userRepository.findById(newsForm.getUser_id()).orElseThrow(() -> new RuntimeException("User not found."));
        News news = newsForm.convert(newsForm, topic, user);
        newsRepository.save(news);
        return news;
    }
}
