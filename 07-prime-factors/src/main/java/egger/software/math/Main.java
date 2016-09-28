package egger.software.math;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import static egger.software.math.Math.primeFactors;

public class Main {
    public static void main(String[] args) throws IOException {
        launch(System.in, System.out);
    }

    public static void launch(InputStream is, OutputStream os) throws IOException {
        try {
            Scanner scanner = new Scanner(is);
            String line = scanner.nextLine();
            String result = primeFactors(Integer.parseInt(line));
            os.write(result.getBytes());
        } catch (Throwable ex) { // Exception boundary
            os.write((ex.getClass().getSimpleName() + ": " + ex.getMessage()).getBytes());
        }
    }
}
