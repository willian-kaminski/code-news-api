package br.com.kaminski.codenews.repository;

import br.com.kaminski.codenews.domain.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicRepository extends JpaRepository<Topic, Long> {

    Optional<Topic> findById(Long id);

}