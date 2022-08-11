package com.bridgelabz;

public class EmpWage {
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Pgm");
		int IS_FULLTIME = 1;
		int EMP_RATE_PER_HOUR = 20;
		int empHrs;
		int empWage;
		double empcheck = Math.floor(Math.random()*10)%2;
		if(empcheck == IS_FULLTIME)
		{
			empHrs = 8;
			System.out.println("Emp is present");
		}
		else 
		{
			empHrs = 0;
			System.out.println("Emp is absent");
		}
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage:"+empWage);
		
	}

}
