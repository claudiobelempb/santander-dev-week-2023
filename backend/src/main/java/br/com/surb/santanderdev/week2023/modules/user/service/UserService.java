package br.com.surb.santanderdev.week2023.modules.user.service;

import br.com.surb.santanderdev.week2023.modules.user.infra.entities.User;

public interface UserService {
	User findById(Long id);
	User create(User user);
}
