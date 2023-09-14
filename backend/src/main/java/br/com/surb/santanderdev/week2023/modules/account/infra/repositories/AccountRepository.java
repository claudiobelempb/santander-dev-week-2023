package br.com.surb.santanderdev.week2023.modules.account.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.surb.santanderdev.week2023.modules.account.infra.entities.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
