package br.com.kaminski.codenews.repository;

import br.com.kaminski.codenews.domain.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {


}
