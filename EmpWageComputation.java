public class EmpWageComputation {

	public static void main(String[] args) {
		int isFullTime = 1;
		int wagePerHr = 20;
		int fullDayHr = 8;
		int dailyWage;

		double empCheck = Math.floor(Math.random() * 10) % 2;

		if (empCheck == 1){
			System.out.println("Employee Is Present");
			dailyWage = wagePerHr*fullDayHr;
		}
		else{
			System.out.println("Employye Is Abscent");
			dailyWage = 0;
		}

		System.out.println("Employee Daily Salary is: " + dailyWage);
	}
}
