package scenario10;


public class Women {
    private static final String DEFAULT = "default";

    private String name;

    public Women(String name) {
        this.name = name;
    }

    public String getName() {
        return NameUtils.isYingying(name) ? DEFAULT : name;
    }
}
