public class EmpWageComputation {

	public static void main(String[] args) {
		int isFullTime = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;

		if (empCheck == 1)
			System.out.println("Employee Is Present");
		else
			System.out.println("Employye Is Abscent");
	}

}
