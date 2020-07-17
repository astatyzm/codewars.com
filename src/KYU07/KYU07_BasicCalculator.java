package KYU07;

public class KYU07_BasicCalculator {
	public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
		switch (operation) {
		case "+":
			return numberOne + numberTwo;
		case "-":
			return numberOne - numberTwo;
		case "*":
			return numberOne * numberTwo + 0.0;
		case "/":
			return (numberTwo != 0) ? (numberOne / numberTwo) : null;
		default:
			return null;
		}

	}

	public static void main(String[] args) {
		calculate(-3, "*", 0);
	}
}