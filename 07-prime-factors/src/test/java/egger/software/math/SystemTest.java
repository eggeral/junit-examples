package egger.software.math;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class SystemTest {
    @Test
    public void aUserCanCalculateThePrimeFactorsUsingTheCommandLine() throws IOException {
        // given
        try (ByteArrayInputStream bis = new ByteArrayInputStream("10\n".getBytes());
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {

            // when
            Main.launch(bis, bos);

            // then
            assertThat(bos.toString(), is("2 * 5"));
        }
    }

    @Test
    public void invalidValuesReturnAnErrorMessage() throws IOException {
        // given
        try (ByteArrayInputStream bis = new ByteArrayInputStream("abc\n".getBytes());
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {

            // when
            Main.launch(bis, bos);

            // then
            assertThat(bos.toString(), is("NumberFormatException: For input string: \"abc\""));
        }
    }

    @Test
    public void emptyLinesReturnAnErrorMessage() throws IOException {
        // given
        try (ByteArrayInputStream bis = new ByteArrayInputStream("\n".getBytes());
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {

            // when
            Main.launch(bis, bos);

            // then
            assertThat(bos.toString(), is("NumberFormatException: For input string: \"\""));
        }
    }
}
