package com.jimi.springpetclinic;


import com.jimi.springpetclinic.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPetClinicApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringPetClinicApplication.class, args);


	}

}
