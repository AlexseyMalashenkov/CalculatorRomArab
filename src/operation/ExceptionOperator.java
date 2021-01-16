package operation;

import java.util.InputMismatchException;

public class ExceptionOperator implements Operation{
    private final char operation;

    public ExceptionOperator(char operation) {
        this.operation = operation;
    }

    @Override
    public int calcResult(int first, int second) {
        throw new InputMismatchException("Неправильный оператор: " + this.operation);
    }
}
