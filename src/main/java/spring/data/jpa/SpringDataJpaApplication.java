package spring.data.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.data.jpa.repository.MyRepository;

@SpringBootApplication
public class SpringDataJpaApplication {
	
	@Autowired
	private MyRepository myRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }
    
}
