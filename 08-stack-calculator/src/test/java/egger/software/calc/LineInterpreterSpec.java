package egger.software.calc;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LineInterpreterSpec {

    @Test
    public void aLineInterpreterInterpretsLinesAndUsesTheCalculator() {
        // given
        StackCalculator calculator = new StackCalculator();
        LineInterpreter interpreter = new LineInterpreter(calculator);

        // when
        interpreter.interpretLine("2");

        // then
        assertThat(calculator.peek(), is(2.0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void aLineInterpreterThrowsAnExceptionIfTheLineCanNotBeInterpreted() {
        // given
        StackCalculator calculator = new StackCalculator();
        LineInterpreter interpreter = new LineInterpreter(calculator);

        // when
        interpreter.interpretLine("invalid");
    }


    @Test
    public void aLineInterpreterInterpretsPlus() {
        // given
        StackCalculator calculator = new StackCalculator();
        LineInterpreter interpreter = new LineInterpreter(calculator);
        calculator.push(6);
        calculator.push(7);

        // when
        interpreter.interpretLine("+");

        // then
        assertThat(calculator.peek(), is(13.0));
    }

    @Test
    public void aLineInterpreterInterpretsMinus() {
        // given
        StackCalculator calculator = new StackCalculator();
        LineInterpreter interpreter = new LineInterpreter(calculator);
        calculator.push(6);
        calculator.push(7);

        // when
        interpreter.interpretLine("-");

        // then
        assertThat(calculator.peek(), is(1.0));
    }

}
