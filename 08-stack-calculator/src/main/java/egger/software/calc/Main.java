package egger.software.calc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        launch(System.in, System.out);
    }

    public static void launch(InputStream is, OutputStream os) throws IOException {
        StackCalculator calculator = new StackCalculator();
        LineInterpreter lineInterpreter = new LineInterpreter(calculator);
        PrintWriter writer = new PrintWriter(os);
        try {
            Scanner scanner = new Scanner(is);
            String line;
            while (!(line = scanner.nextLine()).equals("exit")) {
                try {
                    lineInterpreter.interpretLine(line);
                    writer.println(calculator.peek());
                } catch (IllegalArgumentException ex) {
                    writer.println("error");
                }
                writer.flush();
            }
            writer.println("bye");
        } catch (Throwable ex) { // Exception boundary
            writer.println((ex.getClass().getSimpleName() + ": " + ex.getMessage()));
        } finally {
            writer.flush();
        }
    }
}
