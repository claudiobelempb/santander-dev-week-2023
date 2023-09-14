package br.com.surb.santanderdev.week2023.modules.article.infra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.surb.santanderdev.week2023.modules.article.infra.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
