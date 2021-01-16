package operation;

public class Division implements Operation{
    @Override
    public int calcResult(int first, int second) {
        return first / second;
    }
}
