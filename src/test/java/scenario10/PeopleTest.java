package scenario10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.powermock.api.mockito.PowerMockito.doReturn;
import static org.powermock.api.mockito.PowerMockito.spy;

/**
 * Unit tests for the {@link People} class. This demonstrates one basic
 * usage of PowerMock's ability for mock self static method no matter public or private.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest({People.class})
public class PeopleTest {
    @Test
    public void should_return_correct_string() throws Exception {
        spy(People.class);
        doReturn("Yingying").when(People.class, "callPrivateMethod");
        
        assertEquals(People.callPublicMethod(), "Hi Yingying");
    }
}