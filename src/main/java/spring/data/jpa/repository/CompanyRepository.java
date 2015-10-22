package spring.data.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import spring.data.jpa.models.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company, Integer> {
	
}
