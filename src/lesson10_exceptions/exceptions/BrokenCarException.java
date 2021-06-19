package lesson10_exceptions.exceptions;

public class BrokenCarException extends Exception{
    private final int number;
    private final String model;


    public BrokenCarException(String message, int number, String mod) {
        super(message);
        this.number = number;
        this.model = mod;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "BrokenCarException: " +
                getMessage() +
                "random number = " + number +
                ", model: '" + model + '\'';
    }
}
