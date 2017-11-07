import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
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
}

