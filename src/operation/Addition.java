package operation;

public class Addition implements Operation{
    @Override
    public int calcResult(int first, int second) {
        return first + second;
    }
}
