package com.empwagecomputationprob;

public class EmpWageUC6 {

	
		static final int IS_PRESENT = 2;
		static final int IS_PART_TIME = 4;
		static final int SALARY_PER_HOUR = 30;
		static final int TOTAL_WORK_DAY = 60;
		static final int MAX_WORKING_HOUR = 120;
		static final int FULL_DAY_WORKING_HOUR = 8;

		public static void main(String[] args) {
			int empCheck;
			int empHr = 0;
			int totalSalary = 0;
			int day = 0;
			while (day < TOTAL_WORK_DAY && (empHr + FULL_DAY_WORKING_HOUR) <= MAX_WORKING_HOUR) {
				day++;
				empCheck = (int) (Math.floor(Math.random() * 10) % 3);
				switch (empCheck) {
				case IS_PRESENT:
					empHr += FULL_DAY_WORKING_HOUR;
					break;

				case IS_PART_TIME:
					empHr += (FULL_DAY_WORKING_HOUR / 2);
					break;

				default:
					empHr += 0;
					break;
				}
				System.out.println("Working day : " + day + " (Present : " + empCheck + ")");
			}
			totalSalary = empHr * SALARY_PER_HOUR;
			System.out.println("Monthly Emp Wage : " + totalSalary + "\nTotal working hour : " + empHr);

	}

}
