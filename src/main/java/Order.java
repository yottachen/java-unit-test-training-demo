public class Order {
    private Item[] items;

    public Order(Item[] items) {
        this.items = items;
    }

    public String asString() {
        String out = "";

        for (Item item : items) {
            if (item == null) {
                throw new IllegalArgumentException("Cannot accept null item");
            }
            out += item.getName() + " " + item.getPrice() + " ";
        }

        return out;
    }


}
