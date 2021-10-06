package one.digitalinnovation.experts.productscatalog.repository;

import one.digitalinnovation.experts.productscatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {


}
