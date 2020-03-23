package br.com.kaminski.codenews.repository;

import br.com.kaminski.codenews.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
