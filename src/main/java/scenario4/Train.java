package scenario4;

public class Train {
    public String callPublicMethod() {

        return "public " + callPrivateMethod("private");
    }

    public String callPublicMethodWithMultipleArgs() {

        return "public " + callPrivateMethodWithMultipleArgs("hello", new Platform("platform A"));
    }


    private String callPrivateMethod(String str) {
        return str;
    }

    private String callPrivateMethodWithMultipleArgs(String str, Platform platform) {
        return str + " " + platform.getName();
    }
}
