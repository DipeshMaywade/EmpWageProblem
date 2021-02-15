public class EmpWageComputation {

	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;

	private static int wagePerHr;
	private static int maxMonthHr;
	private static int workingDays;
	private static int fullTimeHr;
	private static int partTimeHr;

	public static int EmpWageComputation(int wagePerHr,int maxMonthHr,int workingDays,int fullTimeHr,int partTimeHr){
		int empHr=0;
		int totalEmpHr=0;
		int days=0;

		while (empHr<=maxMonthHr && days<=workingDays) {

			double empCheck = Math.floor(Math.random() * 10) % 3;
			int empCheck1 = (int)empCheck;

			switch(empCheck1){
				case IS_FULL_TIME:
					empHr = fullTimeHr;
					break;
				case IS_PART_TIME:
					empHr = partTimeHr;
					break;
				default:
					empHr = 0;
			}
			totalEmpHr=totalEmpHr+empHr;
			days++;
		}
		int totalWage = totalEmpHr*wagePerHr;
		return  totalWage;
	}
	public static void main(String[] args) {
		int forCmpny1 = EmpWageComputation(20,100,20,8,4);
		System.out.println("Employee Month Wage for cmpny1 s: " + forCmpny1);
	}

}

