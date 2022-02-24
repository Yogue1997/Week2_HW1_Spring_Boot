package com.week2.hw1.springboot;

//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Tax {
	
	private double pay;
	private double fedIncome = 14.60;
	private double stateIncome = 4.75;
	private double localIncome = 3.32;
	private double ficanStateIns = 7.65;
	private double totalTax = fedIncome + stateIncome + localIncome + ficanStateIns;

	
	


	public double getPay() {
		return pay;
	}


	public void setPay(double pay) {
		this.pay = pay;
	}
	
	
	


	
	
	public void Display () {
		System.out.println("Your salary is: " + pay + " and the tax is: " + totalTax + " and this is what you getting after tax" 
			+ (pay - ((pay * totalTax) / 100 ))	);
	}


	public Tax() {
		// TODO Auto-generated constructor stub
	}

}
