package scenario4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.powermock.api.support.membermodification.MemberMatcher.method;

/**
 * Unit tests for the {@link Train} class. PowerMock can mock private method when don't care about
 * arguments, please see testCallPublicMethod test case. It can not mock private method with mocking arguments,
 * please see testCallPublicMethodWithMultipleArgs test case.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Train.class})
public class TrainTest {

    @Mock
    private Platform platform;

    @Test
    public void testCallPublicMethod() throws Exception {
        Train trainSpy = PowerMockito.spy(new Train());

        PowerMockito.when(trainSpy, method(Train.class, "callPrivateMethod", String.class))
                .withArguments(anyString())
                .thenReturn("mock private");

        Assert.assertEquals("public mock private", trainSpy.callPublicMethod());

    }

    @Test
    public void testCallPublicMethodWithMultipleArgs() throws Exception {
        when(platform.getName()).thenReturn("platform");

        Train train = new Train();
        Train trainSpy = PowerMockito.spy(train);

        // It will throw NullPointerException when call platform.getName(), since this way can't mock private method
//        PowerMockito.when(trainSpy, method(scenario4.Train.class, "callPrivateMethodWithMultipleArgs", String.class, Platform.class))
//                .withArguments(anyString(), any(Platform.class))
//                .thenReturn("Hiyy");

        // It does not work as expected since it won't return "public mock platform", instead it will call actual private method instead of mocking it.
        PowerMockito.when(trainSpy, method(Train.class, "callPrivateMethodWithMultipleArgs", String.class, Platform.class))
                .withArguments("hello", platform)
                .thenReturn("mock platform");

        Assert.assertEquals("public hello platform A", trainSpy.callPublicMethodWithMultipleArgs());

    }
}

