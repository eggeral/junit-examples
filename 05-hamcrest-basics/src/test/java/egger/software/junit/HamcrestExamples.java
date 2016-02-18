package egger.software.junit;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class HamcrestExamples {

    @Test
    public void hamcrest() {
        assertThat(true, is(true));
        assertThat(false, is(not(true)));
        assertThat("test", is(equalTo("test")));
        assertThat(true,
                describedAs("Failed because matcher did not match", is(true)));
        assertThat(false, is(anything()));

        assertThat(new Integer[]{1, 2}, array(is(1), is(2)));

        assertThat(2, is(anyOf(equalTo(2), equalTo(1), equalTo(3))));
        assertThat(2, is(allOf(equalTo(2), greaterThan(1), lessThan(3))));

        assertThat(new Integer(100), hasToString("100"));
        assertThat(new String("test"), instanceOf(String.class));
        assertThat((new String("test")).getClass(), typeCompatibleWith(Object.class));

        assertThat("test", is(notNullValue()));
        assertThat(null, is(nullValue()));

        List<Integer> list = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        assertThat(list, is(list2));
        assertThat(list, hasItem(1));
        assertThat(list, hasItems(1, 3));

        assertThat(list, contains(1, 2, 3));
        // assertThat(list, contains(2, 3)); // contains means has equal items!
        assertThat(list, containsInAnyOrder(3, 1, 2));
        assertThat(list, contains(is(1), is(2), is(greaterThan(2))));


        Student student = new Student("Max");
        assertThat(student, hasProperty("name", equalTo("Max")));
        Student student2 = student;
        assertThat(student2, is(sameInstance(student)));
        assertThat(1.0, is(closeTo(1.1, 0.2)));
    }


}
