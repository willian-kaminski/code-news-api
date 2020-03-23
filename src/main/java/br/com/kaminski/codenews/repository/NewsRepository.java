package br.com.kaminski.codenews.repository;

import br.com.kaminski.codenews.domain.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {

}
