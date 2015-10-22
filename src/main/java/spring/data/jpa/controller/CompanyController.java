package spring.data.jpa.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import spring.data.jpa.models.Company;
import spring.data.jpa.repository.CompanyRepository;

@RestController
@RequestMapping(value = "/companies", produces = MediaType.APPLICATION_JSON_VALUE)
public class CompanyController {
	@Autowired
	private CompanyRepository companyRepository;
	@RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public Iterable<Company> crudOperations(
			@RequestParam("id") Optional<Integer> id
			){
		
		return RestPrecondition.checkFound(companyRepository.findAll());
	}
	@RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public Company oneCompany(@RequestParam("id") Integer id){
		
		return RestPrecondition.checkFound(companyRepository.findOne(id));
	}
}
