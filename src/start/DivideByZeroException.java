package start;

public class DivideByZeroException extends Exception {

    private String errorMessage;

    public DivideByZeroException(String a, String b) {
        this.errorMessage = "Nie mozna podzielic "+a+" przez "+b;
    }

    @Override
    public String getMessage() {
        return this.errorMessage;
    }
}
