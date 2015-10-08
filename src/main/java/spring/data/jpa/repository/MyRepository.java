package spring.data.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.data.jpa.models.Employee;

@Repository
public interface MyRepository extends CrudRepository<Employee, Integer> {
	Iterable<Employee> findByFirstName(@Param("firstName") String firstName);
	Iterable<Employee> findByLastName(@Param("lastName") String lastName);
}
