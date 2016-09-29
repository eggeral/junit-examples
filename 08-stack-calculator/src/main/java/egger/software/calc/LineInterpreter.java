package egger.software.calc;

import static egger.software.calc.Math.isDouble;

public class LineInterpreter {

    private StackCalculator calculator;

    public LineInterpreter(StackCalculator calculator) {

        this.calculator = calculator;
    }

    public void interpretLine(String line) {
        if (isDouble(line))
            calculator.push(Double.valueOf(line));
        else {
            switch (line) {
                case "+":
                    calculator.sum();
                    break;
                case "-":
                    calculator.sub();
                    break;
                default:
                    throw new IllegalArgumentException(line);
            }
        }
    }
}
