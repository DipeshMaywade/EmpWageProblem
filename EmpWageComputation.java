class Object {
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;

	private final String company;
	private final int wagePerHr;
	private final int maxMonthHr;
	private final int workingDays;
	private final int fullTimeHr;
	private final int partTimeHr;

	public Object(String company, int wagePerHr, int maxMonthHr, int workingDays, int fullTimeHr, int partTimeHr) {
		this.company = company;
		this.wagePerHr = wagePerHr;
		this.maxMonthHr = maxMonthHr;
		this.workingDays = workingDays;
		this.fullTimeHr = fullTimeHr;
		this.partTimeHr = partTimeHr;

	}
	public void companyWage() {
		int empHr = 0;
		int totalEmpHr = 0;
		int days = 0;

		while (empHr <= maxMonthHr && days <= workingDays) {

			double empCheck = Math.floor(Math.random() * 10) % 3;
			int empCheck1 = (int) empCheck;

			switch (empCheck1) {
				case IS_FULL_TIME:
					empHr = fullTimeHr;
					break;
				case IS_PART_TIME:
					empHr = partTimeHr;
					break;
				default:
					empHr = 0;
			}
			totalEmpHr = totalEmpHr + empHr;
			days++;
		}
		int totalWage = totalEmpHr * wagePerHr;
		System.out.println("Total Wage For " + company + " Company Employee Is " + totalWage);
	}
}

public class EmpWageComputation{
	public static void main(String[] args) {
		Object dMart = new Object("D-Mart",20,100,20,8,4);
		dMart.companyWage();
		Object TCS = new Object("TCS",10,50,20,6,3);
		TCS.companyWage();
	}
}

