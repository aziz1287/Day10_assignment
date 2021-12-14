package com.empwagecomputationprob;

public class EmpWageUC4 {

	
		
		static final int IS_FULL_TIME = 1;
		static final int IS_PART_TIME = 2;
		static final int SALARY_PER_HOUR = 50;

		public static void main(String[] args) {
			usingSwitchCases();
		}

		private static void usingSwitchCases() {
			int empCheck;
			empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			int empHr = 0;

			switch (empCheck) {
			case IS_FULL_TIME:
				empHr = 9;
				break;

			case IS_PART_TIME:
				empHr = 4;
				break;

			default:
				empHr = 0;
				break;
			}

			double empSalary = empHr * SALARY_PER_HOUR;
			System.out.println("Emp Wage : " + empSalary);

	}

}
