package scenario3;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class IrisTest {

    private Iris iris = new Iris(null);

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void should_throw_exception_using_fail() throws Exception {
        try {
            iris.getName();
            fail("Exception is thrown");
        } catch (Exception ex) {
            assertTrue(ex instanceof IllegalArgumentException);
            assertTrue(ex.getMessage().contains("The name cannot be null"));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_using_expect_annotation() throws Exception {
        iris.getName();
    }

    @Test
    public void should_throw_exception_using_rule_annotation() throws Exception {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("The name cannot be null");
        iris.getName();
    }

}
