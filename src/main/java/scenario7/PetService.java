package scenario7;

public class PetService {

    public String like() {
        return new Dog().bite() ? "I like it" : "I hate it";
    }
}
