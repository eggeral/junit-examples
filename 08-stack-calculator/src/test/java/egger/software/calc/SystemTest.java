package egger.software.calc;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class SystemTest {
    @Test
    public void calculatesTheResultOfASeriesOfMathOperations() throws IOException {
        // given
        String input = "6\n5\n2\n+\n-\nexit\n";

        try (ByteArrayInputStream bis = new ByteArrayInputStream(input.getBytes());
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            // when
            Main.launch(bis, bos);

            // then
            assertThat(bos.toString(), is("6.0\n5.0\n2.0\n7.0\n1.0\nbye\n"));
        }
    }

    @Test
    public void printsErrorIfTheEnteredLineIsInvalid() throws IOException {
        // given
        String input = "abc\nexit\n";

        try (ByteArrayInputStream bis = new ByteArrayInputStream(input.getBytes());
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            // when
            Main.launch(bis, bos);

            // then
            assertThat(bos.toString(), is("error\nbye\n"));
        }
    }


    @Test
    public void exitsIfTheUserEntersExit() throws IOException {
        // given
        String input = "exit\n";

        try (ByteArrayInputStream bis = new ByteArrayInputStream(input.getBytes());
             ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            // when
            Main.launch(bis, bos);

            // then
            assertThat(bos.toString(), is("bye\n"));
        }
    }
}