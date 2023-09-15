package br.com.surb.santanderdev.week2023.modules.user.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import br.com.surb.santanderdev.week2023.modules.user.infra.entities.User;
import br.com.surb.santanderdev.week2023.modules.user.infra.repositories.UserRepository;
import br.com.surb.santanderdev.week2023.modules.user.service.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User user) {
		if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
			throw new IllegalArgumentException("This Account Number already exist");
		}
		return userRepository.save(user);
	}

}
