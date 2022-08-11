package com.bridgelabz;

public class EmpWage {
		static final int IS_FULLTIME = 1;
		static final int IS_PARTTIME = 2;
		static final int EMP_RATE_PER_HOUR = 20;
		static final int NUM_WORKING_DAYS = 20;
		static final int WORKING_HRS_IN_MONTH = 100;
		/*
		 * UC7 : refactor the code to write class method to compute emp wage
		 */
		public void computeEmpWage()
		{
			 int empHrs,totalEmpWage,totalEmpHrs=0,totalWorkingDays=0;
			 /*
			  * UC5 : calculate employee wages for month
			  * UC6 : calculate wages till a condition of total working hrs or days is reached for month
			  */ 
			  while(totalEmpHrs<=WORKING_HRS_IN_MONTH && totalWorkingDays<NUM_WORKING_DAYS)
			    {	
			    	totalWorkingDays++;
			   	/*
				 * UC1 : for employee attendance
				 */

		    	int empcheck=(int)Math.floor(Math.random()*10)%3;	
		    
		    /*
		    }
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
			 totalEmpHrs +=empHrs;
			 System.out.println(" Day:"+totalWorkingDays  +  " Total EmpHours:"+totalEmpHrs);
		    }
		    totalEmpWage=totalEmpHrs*EMP_RATE_PER_HOUR;
		    System.out.println("Total Emp Wage Is:"+totalEmpWage);
	
		}
		public static void main(String[] args) {
			EmpWage e = new EmpWage();
			System.out.println("Welcome to Employee Wage Computation Pgm");
			e.computeEmpWage();
		}

}
