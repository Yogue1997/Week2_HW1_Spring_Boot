package com.week2.hw1.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class policeOfficer {
	
	private String pname;
	private int page;
	private char pgender;
//	private double psalary;
	
	


	@Autowired
	Tax tax;
	
	
	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}


	public char getPgender() {
		return pgender;
	}


	public void setPgender(char gender) {
		this.pgender = gender;
	}
	
//	public double getPsalary() {
//		return psalary;
//	}
//
//
//	public void setPsalary(double psalary) {
//		this.psalary = psalary;
//	}


	public Tax getTax() {
		return tax;
	}


	
	public void pDisplay () {
		System.out.println( "Police Officer name: " + pname + ", age: " + page + ", gender: " + pgender);
	}


	public void setTax(Tax tax) {
		this.tax = tax;
	}


	public policeOfficer() {
		// TODO Auto-generated constructor stub
	}

}
