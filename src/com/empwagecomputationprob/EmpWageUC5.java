package com.empwagecomputationprob;

public class EmpWageUC5 {

	
		static final int IS_FULL_TIME = 2;
		static final int IS_PART_TIME = 4;
		static final int SALARY_PER_HOUR = 30;
		static final int TOTAL_WORK_DAY = 60;

		public static void main(String[] args) {
			calculateWageOfMonth();
		}

		private static void calculateWageOfMonth() {
			int empCheck;
			int empHr = 0;
			int totalSalary = 0;
			for (int i = 1; i <= 20; i++) {
				empCheck = (int) (Math.floor(Math.random() * 10) % 3);
				switch (empCheck) {
				case IS_FULL_TIME:
					empHr = 8;
					break;

				case IS_PART_TIME:
					empHr = 4;
					break;

				default:
					empHr = 0;
					break;
				}
				double empSalary = empHr * SALARY_PER_HOUR;
				totalSalary = totalSalary + (int) empSalary;
			}
			System.out.println("Monthly Emp Wage : " + totalSalary);
	}

}
