package fruit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

/**
 * Unit tests for the {@link FruitBox} class. This demonstrates one basic
 * usage of PowerMock's ability for mock constructor method if you want to
 * mock the object which is created within the test method.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({FruitBox.class})
public class FruitBoxTest {
    private FruitBox fruitBox = new FruitBox();

    @Test
    public void shouldGetFruitName() throws Exception {
        Fruit fruit = mock(Fruit.class);
        when(fruit.getName()).thenReturn("Pear");

        // Mock the constructor method
        whenNew(Fruit.class).withAnyArguments().thenReturn(fruit);

        assertThat(fruitBox.getFruitName(), is("Pear"));
    }
}
