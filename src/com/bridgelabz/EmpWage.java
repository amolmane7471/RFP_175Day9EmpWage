package com.bridgelabz;

public class EmpWage {
		static final int IS_FULLTIME = 1;
		static final int IS_PARTTIME = 2;
		static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Pgm");
		int empHrs;
		int empWage;
		/*
		 * UC1 : for employee attendance
		 */
		int empcheck=(int)Math.floor(Math.random()*10)%3;
		/*
		 * UC4 : using switch case
		 */
		switch (empcheck) {
		case IS_FULLTIME:
					empHrs = 8;
					System.out.println("Emp is full time present");
					break;
		/*
		 * UC3 : for part time employee and wages
		 */
		case IS_PARTTIME:
					empHrs=4;
					System.out.println("Emp is part time present");
					break;
		default :
					empHrs = 0;
					System.out.println("Emp is absent");
		}
		/*
		 * UC2 : for daily employee wages
		 */
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage:"+empWage);
		
	}

}
