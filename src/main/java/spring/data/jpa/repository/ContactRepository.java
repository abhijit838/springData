package spring.data.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.data.jpa.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
