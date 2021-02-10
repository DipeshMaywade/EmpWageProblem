public class EmpWageComputation {

	public static void main(String[] args) {
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int maxHr = 8;
		int maxMonthHr = 100;
		int empHr = 0;
		int partTimeHr = 4;
		int workingDays = 20;
		int totalEmpHr = 0;

		int hr = 0;
		int days=0;
		while (hr<=maxMonthHr && days<=workingDays) {

		double empCheck = Math.floor(Math.random() * 10) % 3;
		int empCheck1 = (int)empCheck;

		switch(empCheck1){
			case 1:
	                        empHr = maxHr;
				break;
			case 2:
                 		empHr = partTimeHr;
				break;
			default:
				empHr = empHr;
			}

			totalEmpHr=totalEmpHr+empHr;

			hr++;
			days++;
		}

		int monthWage = totalEmpHr*wagePerHr;
		System.out.println("Employee Month Wage is: " + monthWage);

	}

}
