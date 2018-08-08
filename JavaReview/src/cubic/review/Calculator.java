package cubic.review;

public class Calculator {

	public double add(double a, double b) {
		double result = a + b;
		System.out.println("adding values ==>> " + result);
		return result;
	}

	public double substraction(double a, double b) {
		
		double result = 0;
		if (a > b) {
			result = a - b;
		} else {
			result = b - a;
			
		}

		System.out.println("substracting values ==>>" + result);
		return result;
	}

	public double devide(double a, double b) {
		double result = 0;
		if (a == 0) {
			throw new ArithmeticException("zero value cant be devided ");

		} else {
			result = a / b;
		}
		System.out.println("the values i devide :==>> " + result);
		return result;
	}

	public double multiply(double a, double b) {

		double result = 0;

		result = a * b;
		System.out.println("multiplying values :==>>" + result);
		return result;

	}

}
