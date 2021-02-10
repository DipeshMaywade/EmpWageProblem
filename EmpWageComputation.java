public class EmpWageComputation {

	public static void main(String[] args) {
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int maxHr = 8;
		int partTimeHr = 4;
		int empHr;

		double empCheck = Math.floor(Math.random() * 10) % 3;

		if (empCheck == 1){
			System.out.println("Employee is present");
			empHr = maxHr;
		}

		else if(empCheck == 2) {
			System.out.println("Employee is part time");
			empHr = partTimeHr;
		}
		else {
			System.out.println("Employee is Abscent");
			empHr = 0;
		}

		int dailyWage = empHr*wagePerHr;
		System.out.println("Employee Daily Wage is" + dailyWage);
	}

}
