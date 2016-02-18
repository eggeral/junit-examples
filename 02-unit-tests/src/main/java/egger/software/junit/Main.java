package egger.software.junit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			Calculator calculator = new Calculator(a, b);
			System.out.println("Result: " + calculator.sum());
		}
	}
}
