package com.empwagecomputationprob;

public class EmpWageUC3 {

	public static void main(String[] args) {
		
		patTimeEmployeeWage();
		}

		private static void patTimeEmployeeWage() {
			int IS_FULL_TIME = 1;
			int IS_PART_TIME = 2;
			int SALARY_PER_HOUR = 50;
			
			double empCheck = Math.floor(Math.random() * 10) % 3;
			
			int empHr = 0;
			
			if (empCheck == IS_FULL_TIME) {
				empHr = 10;
				
			} else if (empCheck == IS_PART_TIME) {
				empHr = 8;
				
			} else {
				empHr = 0;
			}
			double empSalary = empHr * SALARY_PER_HOUR;
			System.out.println("Emp Wage : " + empSalary);

	}

}
