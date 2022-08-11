package com.bridgelabz;

public class EmpWage {
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Pgm");
		int IS_FULLTIME=1;
		double empcheck=Math.floor(Math.random()*10)%2;
		if(empcheck==IS_FULLTIME)
			System.out.println("Emp is present");
		else 
			System.out.println("Emp is absent");

	}

}
