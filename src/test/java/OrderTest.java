import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class OrderTest {
    @Test
    public void asStringShouldOuputOrderDetails() throws Exception {
        Item item1 = new Item("Apple", 1);
        Item item2 = new Item("Pear", 2);
        Item[] items = new Item[]{item1, item2};

        Order order = new Order(items);
        assertThat(order.asString(), is("Apple 1.0 Pear 2.0 "));
    }

    @Test(expected = IllegalArgumentException.class)
    public void asStringShouldNotAllowANullItem() throws Exception {
        Item[] items = new Item[]{null};
        Order order = new Order(items);
        order.asString();

        verify(order).asString();
    }

}
