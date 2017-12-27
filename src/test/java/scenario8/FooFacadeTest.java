package scenario8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(MockitoJUnitRunner.class)
public class FooFacadeTest {

    @Mock
    FooDAO fooDAOMock;

    @Test
    public void should_success_when_fun() throws Exception {
        when(fooDAOMock.fun()).thenReturn("wrong");

        assertThat(new FooFacade(fooDAOMock).fun(), is("wrong"));
    }

}
