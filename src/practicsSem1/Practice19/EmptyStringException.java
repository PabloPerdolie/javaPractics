package practicsSem1.Practice19;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("Передана пустая строка");
    }
}
