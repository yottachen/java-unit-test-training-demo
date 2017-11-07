import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.powermock.api.support.membermodification.MemberMatcher.method;

@RunWith(PowerMockRunner.class)
@PrepareForTest({Train.class})
public class TrainTest {

    @Test
    public void testCallPublicMethod() throws Exception {
        Train train = new Train();
        Train trainSpy = PowerMockito.spy(train);

        PowerMockito.when(trainSpy, method(Train.class, "callPrivateMethod", String.class))
                .withArguments(anyString())
                .thenReturn("Hiyy");

        assertEquals("Hiyy", trainSpy.callPublicMethod());

    }

    @Test
    public void testCallPublicMethodWithMultipleArgs() throws Exception {
        Item item = mock(Item.class);
        when(item.getName()).thenReturn("apple");

        Train train = new Train();
        Train trainSpy = PowerMockito.spy(train);

        // It will throw NullPointerException when call item.getName(), since this way can't mock private method
//        PowerMockito.when(trainSpy, method(Train.class, "callPrivateMethodWithMultipleArgs", String.class, Item.class))
//                .withArguments(anyString(), any(Item.class))
//                .thenReturn("Hiyy");

        // It does not work as expected since it won't return "Hiyy", instead it will call the private method instead of mocking it.
        PowerMockito.when(trainSpy, method(Train.class, "callPrivateMethodWithMultipleArgs", String.class, Item.class))
                .withArguments("hello", item)
                .thenReturn("Hiyy");

        assertEquals("Hihello", trainSpy.callPublicMethodWithMultipleArgs());

    }
}

