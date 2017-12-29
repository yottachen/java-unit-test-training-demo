package scenario10;


public class People {
    public static String callPublicMethod() {
        return "Hi " + callPrivateMethod();
    }

    private static String callPrivateMethod() {
        return "Monster";
    }
}
