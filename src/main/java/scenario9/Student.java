package scenario9;

public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        if (name == null) {
            throw new IllegalArgumentException("The student name cannot be null");
        }
        return name;
    }
}
