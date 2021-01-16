package operation;

public class Multiplication implements Operation{
    @Override
    public int calcResult(int first, int second) {
        return first * second;
    }
}
