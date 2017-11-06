public class CashRegister {

    private final Printer printer;

    public CashRegister(Printer printer) {
        this.printer = printer;
    }

    public void process(Order order) {
        printer.print(order.asString());
    }

}

