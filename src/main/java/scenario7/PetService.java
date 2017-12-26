package scenario7;

public class PetService {

    public String like() {
        Dog dog = new Dog();
        return dog.bite() ? "I like it" : "I hate it";
    }
}
