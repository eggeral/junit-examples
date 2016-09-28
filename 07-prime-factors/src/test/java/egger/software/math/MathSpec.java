package egger.software.math;

import org.junit.Test;

import static egger.software.math.Math.primeFactors;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class MathSpec {

    @Test
    public void primeFactorsCalculateThePrimeFactorsOfAGivenNumber() {
        assertThat(primeFactors(0), is("This value is not valid!"));
        assertThat(primeFactors(-1), is("This value is not valid!"));
        assertThat(primeFactors(1), is("This value is not valid!"));
        assertThat(primeFactors(2), is("2"));
        assertThat(primeFactors(5), is("5"));
        assertThat(primeFactors(10), is("2 * 5"));
        assertThat(primeFactors(256), is("2^8"));
        assertThat(primeFactors(6534), is("2 * 3^3 * 11^2"));
        assertThat(primeFactors(13332), is("2^2 * 3 * 11 * 101"));
    }
}
