public class EmpWageComputation {

	public static void main(String[] args) {
		int isFullTime = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int maxHr = 8;
		int empHr = 0;
		int partTimeHr = 4;

		double empCheck = Math.floor(Math.random() * 10) % 3;
		int empCheck1 = (int)empCheck;

		switch(empCheck1){
			case 1:
				System.out.println("Employee is FullTime present");
	                        empHr = maxHr;
				break;
			case 2:
				System.out.println("Employee is PartTime present");
                  	  	empHr = partTimeHr;
				break;
			default:
				System.out.println("Employee is Abscent");
				empHr = empHr;
			}

		int dailyWage = empHr*wagePerHr;
		System.out.println("Employee Daily Wage is: " + dailyWage);

	}

}
