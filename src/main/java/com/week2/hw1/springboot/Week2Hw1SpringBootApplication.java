package com.week2.hw1.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Week2Hw1SpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Week2Hw1SpringBootApplication.class, args);
		Tax tax = context.getBean(Tax.class);
		policeOfficer p1 = context.getBean(policeOfficer.class);
		softwareEng se1 = context.getBean(softwareEng.class);
		tax.setPay(75000.00);
		p1.setPname("Youssouf");
		p1.setPage(24);
		p1.setPgender('M');
		p1.setTax(tax);
		se1.setSeAge(22);
		se1.setSeGender('F');
		se1.setSeName("Sarah");
		se1.setTax(tax);
		
		p1.pDisplay();
		p1.getTax().Display();
		
		se1.seDisplay();
		se1.getTax().Display();
		
		
		
		
	}

}
