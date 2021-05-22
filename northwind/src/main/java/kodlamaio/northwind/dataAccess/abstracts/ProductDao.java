package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.conretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
