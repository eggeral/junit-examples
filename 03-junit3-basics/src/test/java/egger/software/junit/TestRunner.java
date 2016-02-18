package egger.software.junit;

import junit.framework.TestCase;

public class TestRunner {
    public static void main(String[] args) {
        // Type safe way of running tests.
        TestCase test = new JUnit3Examples("junit examples") {
            public void runTest() {
                methodNotStartingWithTest();
            }
        };
        test.run();
    }


}
