package scenario3;

public class Iris {
    private String name;

    public Iris(String name) {
        this.name = name;
    }

    public String getName() {
        if(name == null) {
            throw new IllegalArgumentException("The name cannot be null");
        }
        return name;
    }
}
