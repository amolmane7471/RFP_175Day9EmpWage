package com.bridgelabz;

public class EmpWage {
		 final int IS_FULLTIME = 1;
		 final int IS_PARTTIME = 2;
	
		/*
		 * UC7 : refactor the code to write class method to compute emp wage
		 * UC8 : compute employee wages for multiple company
		 */
		public void computeEmpWage(String company ,int emp_RATE_PER_HOUR,int num_WORKING_DAYS,int working_HRS_IN_MONTH)
		{
			 int empHrs , totalEmpWage , totalEmpHrs = 0 , totalWorkingDays = 0;
			 /*
			  * UC5 : calculate employee wages for month
			  * UC6 : calculate wages till a condition of total working hrs or days is reached for month
			  */ 
			  while(totalEmpHrs <= working_HRS_IN_MONTH && totalWorkingDays < num_WORKING_DAYS)
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
						empHrs = 4;
						System.out.println("Emp is part time present");
						break;
			default :
						empHrs = 0;
						System.out.println("Emp is absent");
			}
			/*
			 * UC2 : for daily employee wages
			 */
			 totalEmpHrs += empHrs;
			 System.out.println(" Day: "+totalWorkingDays  + " Total EmpHours: "+totalEmpHrs);
		    }
		    totalEmpWage = totalEmpHrs * emp_RATE_PER_HOUR;
		    System.out.println("Total Emp Wage for company "+company+" is "+totalEmpWage);
		    System.out.println("***************");
		}
		public static void main(String[] args) {
			EmpWage dmart = new EmpWage();
			EmpWage google = new EmpWage();
			EmpWage microsoft = new EmpWage();
			System.out.println("Welcome to Employee Wage Computation Pgm");
			dmart.computeEmpWage("DMart",10,8,10);
			google.computeEmpWage("google",20,10,20);
			microsoft.computeEmpWage("Microsoft", 20,15,30);
		}

}
