package io.netapp.application;

import io.netapp.domain.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}
	@RequestMapping("/customer")
	public Customer getCustomer(){
		Customer customer=new Customer();
		customer.setCustomer_id(1);
		customer.setName("Yack");
		return customer;
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
