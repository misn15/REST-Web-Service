package customer;

import org.springframework.data.repository.CrudRepository;

// Spring will automatically implement this CRUD repository interface into a Bean
// Bean is a spring object

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}