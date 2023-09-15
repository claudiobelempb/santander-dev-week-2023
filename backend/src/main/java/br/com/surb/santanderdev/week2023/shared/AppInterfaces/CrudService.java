package br.com.surb.santanderdev.week2023.shared.AppInterfaces;

import java.util.List;

public interface CrudService<D, E> {
	List<E> findAll();

	E findById(D id);

	E create(E entity);

	E update(D id, E entity);

	void delete(D id);
}
