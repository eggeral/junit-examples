package egger.software.junit;

import junit.framework.TestCase;

// (JUnit3) unit tests extend TestCase
public class JUnit3Examples extends TestCase {

    // (JUnit3) test methods start with test.
    public void testBasic() {

        assertTrue(1 == 1);
        assertFalse("1 should be 2", 1 == 2);
        assertEquals(3.0, 3.00000001, 0.001);
        assertEquals("test", "test");
        assertNotNull(new Student("Max"));
        assertNull(null);

        Student student1 = new Student("Fritz");
        Student student2 = new Student("Otto");
        Student student3 = student1;
        assertSame(student1, student3);
        assertNotSame(student1, student2);

        //fail();
        //fail("Not implemented yet!");

    }

    public void testExceptions() {
        Student student = new Student("Test");
        try {
            student.setName("@Test");
            fail("Expected: " + IllegalArgumentException.class.toString());
        } catch (IllegalArgumentException ex) {
            // expected exception
        }
    }

    public void setUp() {
        System.out.println("Executed before each test.");
    }

    public void tearDown() {
        System.out.println("Executed after each test.");
    }

    public void testAnotherTest() {
        assertTrue(true);
    }

    public JUnit3Examples(String name) {
        super(name);
    }

    public void methodNotStartingWithTest() {
        assertTrue(true);
    }

}
