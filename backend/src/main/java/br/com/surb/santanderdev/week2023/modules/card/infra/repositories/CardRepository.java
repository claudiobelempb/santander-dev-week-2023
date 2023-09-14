package br.com.surb.santanderdev.week2023.modules.card.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.surb.santanderdev.week2023.modules.card.infra.entities.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {

}
