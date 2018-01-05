package scenario10;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the {@link Women} class. This demonstrates one basic
 * usage of PowerMock's ability for mock other class static method.
 */

@RunWith(PowerMockRunner.class)
@PrepareForTest(NameUtils.class)
public class WomenTest {
    private Women women;

    @Test
    public void shouldReturnDefaultWhenNameIsYingying() throws Exception {
        String name = "Yingying";
        women = new Women(name);

        PowerMockito.mockStatic(NameUtils.class);
        Mockito.when(NameUtils.isYingying(name)).thenReturn(false);

        assertEquals("Yingying", women.getName());
    }
}