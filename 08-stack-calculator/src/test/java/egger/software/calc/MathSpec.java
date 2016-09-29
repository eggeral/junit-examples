package egger.software.calc;

import org.junit.Test;

import static egger.software.calc.Math.isDouble;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MathSpec {

    @Test
    public void isDoubleDeterminesIfAStringCanBeConvertedIntoADouble() {
        assertThat(isDouble("0"), is(true));
        assertThat(isDouble("0.1"), is(true));

        assertThat(isDouble(""), is(false));
        assertThat(isDouble("abcd"), is(false));
    }


}
