package br.com.surb.santanderdev.week2023.modules.features.infra.entities;

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
@Entity(name = "tb_feature")
public class Feature {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long featureId;
	private String icon;
	private String description;
}
