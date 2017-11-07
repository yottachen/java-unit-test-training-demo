public class Train {
    public String callPublicMethod() {

        return "Hi" + callPrivateMethod("hello");
    }

    public String callPublicMethodWithMultipleArgs() {

        return "Hi " + callPrivateMethodWithMultipleArgs("hello", new Item("apple", 10));
    }


    private String callPrivateMethod(String str) {
        return str;
    }

    private String callPrivateMethodWithMultipleArgs(String str, Item item) {
        return str + " " + item.getName();
    }
}
