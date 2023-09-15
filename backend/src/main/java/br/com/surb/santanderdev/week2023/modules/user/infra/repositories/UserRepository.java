package br.com.surb.santanderdev.week2023.modules.user.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.surb.santanderdev.week2023.modules.user.infra.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	boolean existsByAccountNumber(String accountNumber);
}
