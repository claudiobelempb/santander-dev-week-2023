package br.com.surb.santanderdev.week2023.modules.user.infra.entities;

import java.util.ArrayList;
import java.util.List;

import br.com.surb.santanderdev.week2023.modules.account.infra.entities.Account;
import br.com.surb.santanderdev.week2023.modules.article.infra.entities.Article;
import br.com.surb.santanderdev.week2023.modules.card.infra.entities.Card;
import br.com.surb.santanderdev.week2023.modules.feature.infra.entities.Feature;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id", unique = true)
	private Account account;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "card_id", unique = true)
	private Card card;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private final List<Feature> features = new ArrayList<>();

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private final List<Article> articles = new ArrayList<>();

}
