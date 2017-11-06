import org.junit.Test;
import static org.mockito.Mockito.*;

public class CashRegisterTest {
    @Test
    public void processShouldPrintTheOrder() throws Exception {
        // Data preparation
        Order order = mock(Order.class);
        when(order.asString()).thenReturn("order as string");
        Printer printer = mock(Printer.class);

        // Call method
        CashRegister cashRegister = new CashRegister(printer);
        cashRegister.process(order);

        // Verification
        verify(printer, times(1)).print("order as string");
    }
}
