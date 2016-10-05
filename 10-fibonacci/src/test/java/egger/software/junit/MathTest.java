package egger.software.junit;

import static egger.software.junit.Math.fibonacci;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

    @Test
    public void calculatesTheNthFibonacciNumber() {
        assertThat(fibonacci(1), is(1L));
        assertThat(fibonacci(2), is(1L));
        assertThat(fibonacci(3), is(2L));
        assertThat(fibonacci(4), is(3L));
        assertThat(fibonacci(5), is(5L));
        assertThat(fibonacci(6), is(8L));
        assertThat(fibonacci(20), is(6765L));

        //assertThat(fibonacci(51), is(20365011074L)); // wow that takes really long!!! (1m)
    }

    @Test(expected = IllegalArgumentException.class)
    public void fibonacciOf0Throws() {
        fibonacci(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fibonacciOfNegativeNumbersThrows() {
        fibonacci(-1);
    }


}
