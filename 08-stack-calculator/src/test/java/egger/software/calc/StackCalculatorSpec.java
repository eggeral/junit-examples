package egger.software.calc;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StackCalculatorSpec {

    @Test
    public void aStackCalculatorCanSumUpNumbersAndPushTheResultBack() {
        //given
        StackCalculator stackCalculator = new StackCalculator();

        stackCalculator.push(1.0);
        stackCalculator.push(2.0);

        // when
        stackCalculator.sum();

        // then
        assertThat(stackCalculator.peek(), is(3.0));
    }

    @Test
    public void aStackCalculatorCanSubtractTwoNumbersAndPushTheResultBack() {
        //given
        StackCalculator stackCalculator = new StackCalculator();

        stackCalculator.push(1.0);
        stackCalculator.push(2.0);

        // when
        stackCalculator.sub();

        // then
        assertThat(stackCalculator.peek(), is(1.0));
    }

    @Test
    public void aStackCalculatorCanPerformMultipleOperationsInSequence() {
        //given
        StackCalculator stackCalculator = new StackCalculator();

        stackCalculator.push(7.0);
        stackCalculator.push(6.0);
        stackCalculator.push(4.0);
        stackCalculator.push(3.0);

        // when
        stackCalculator.sum(); // 3 + 4 = 7
        stackCalculator.sum(); // 7 + 6 = 13
        stackCalculator.sub(); // 13 - 7 = 6

        // then
        assertThat(stackCalculator.peek(), is(6.0));
    }


}
