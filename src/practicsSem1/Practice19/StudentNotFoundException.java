package Practics.Practice19;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String name) {
        super("Студент с именем "+ name + " не найден!");
    }
}
