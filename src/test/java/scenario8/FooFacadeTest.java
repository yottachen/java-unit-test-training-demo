package scenario8;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FooFacadeTest {

    FooDAOMocker fooDAOMock = new FooDAOMocker();

    @Test
    public void should_success_when_fun() throws Exception {
        FooFacade fooFacade = new FooFacade();
        fooFacade.setFooDAO(fooDAOMock);
        assertThat(fooFacade.fun(), is("hello"));
    }

}

class FooDAOMocker implements FooDAOInterface {

    public String fun() {
        return "hello";
    }
}
