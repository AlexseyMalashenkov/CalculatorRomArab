package logic;

import operation.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operationMap = new HashMap<>();

    public Calculator() {
        this.operationMap.put("+", new Addition());
        this.operationMap.put("-", new Subtraction());
        this.operationMap.put("*", new Multiplication());
        this.operationMap.put("/", new Division());
    }

    public int doCalculation(int operand1, String operation, int operand2) {
        Operation operationMap = this.operationMap.getOrDefault(operation, new ExceptionOperator(operation));

        return operationMap.calcResult(operand1, operand2);
    }
}
