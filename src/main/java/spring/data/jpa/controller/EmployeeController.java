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

import spring.data.jpa.exception.RequestedResourceNotFoundException;
import spring.data.jpa.models.Employee;
import spring.data.jpa.repository.MyRepository;

@RestController
@RequestMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {
	@Autowired
	private MyRepository myRepository;
	
	@RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public Iterable<Employee> findAllCrud(
			@RequestParam("firstName") Optional<String> firstNameParam, 
			@RequestParam("lastName") Optional<String> lastNameParam) 
					throws RequestedResourceNotFoundException{
		if(firstNameParam.isPresent()){
			return RestPrecondition.checkFound(myRepository.findByFirstName(firstNameParam.get()));
		}else if(lastNameParam.isPresent()){
			return RestPrecondition.checkFound(myRepository.findByLastName(lastNameParam.get()));
		}
		
		return myRepository.findAll();
	}
	
	@RequestMapping(value = "id")
	public Employee findByIdCrud(@RequestParam("id") Optional<Integer> empIdParam){
		//System.out.println(myRepository.findOne(empIdParam.get()).getAddress().get(0).getCountry());
		return RestPrecondition.checkFound(myRepository.findOne(empIdParam.get()));
	}
}
