package egger.software.junit;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator(1,3);
		if (calc.sum() != 3) {
			System.out.println("Fehler!");
			System.exit(-1);
		}
		System.out.println("Alles richtig!");
			
	}
}
