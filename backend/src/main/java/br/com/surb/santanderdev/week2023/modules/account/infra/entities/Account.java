package br.com.surb.santanderdev.week2023.modules.account.infra.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;

	@Column(unique = true)
	private String number;
	private String agency;

	@Column(precision = 13, scale = 2)
	private BigDecimal balance;

	@Column(precision = 13, scale = 2)
	private BigDecimal accountLimit;

}
