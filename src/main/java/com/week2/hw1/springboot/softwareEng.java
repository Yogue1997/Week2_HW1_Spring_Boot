package com.week2.hw1.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class softwareEng {
	
	private String seName;
	private int seAge;
	private char seGender;
//	private double seSalary;
	

	@Autowired
	Tax tax;

	public String getSeName() {
		return seName;
	}

	public void setSeName(String seName) {
		this.seName = seName;
	}

	public int getSeAge() {
		return seAge;
	}

	public void setSeAge(int seAge) {
		this.seAge = seAge;
	}

	public char getSeGender() {
		return seGender;
	}

	public void setSeGender(char seGender) {
		this.seGender = seGender;
	}
	
//	public double getSeSalary() {
//		return seSalary;
//	}
//
//	public void setSeSalary(double seSalary) {
//		this.seSalary = seSalary;
//	}


	public Tax getTax() {
		return tax;
	}

	
	public void seDisplay() {
		System.out.println( "Name: " + seName + ", Age: " + seAge + ", Gender: " + seGender);
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public softwareEng() {
		// TODO Auto-generated constructor stub
	}

}
