package application.repository;

import org.springframework.data.repository.CrudRepository;

import application.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	Iterable<Product> findAll();

	Product findById(Integer id);

	void deleteById(Integer id);
}
