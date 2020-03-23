package br.com.kaminski.codenews.repository;

import br.com.kaminski.codenews.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
