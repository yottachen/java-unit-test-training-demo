package scenario7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Unit tests for the {@link PetService} class. This demonstrates one basic
 * usage of PowerMock's ability for mock constructor method if you want to
 * mock the object which is created within the test method.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({PetService.class})
public class PetServiceTest {
    @Mock
    private Dog dog;

    private PetService petService = new PetService();

    @Test
    public void testLike() throws Exception {
        when(dog.bite()).thenReturn(false);
        PowerMockito.whenNew(Dog.class).withNoArguments().thenReturn(dog);

        assertThat(petService.like(), is("I hate it"));
    }

}