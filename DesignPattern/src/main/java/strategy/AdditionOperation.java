package strategy;

/**
 * add two numbers. a + b
 */
class AdditionOperation implements MathOperation {
    @Override
    public int performOperation(int a, int b) {
        return a + b;
    }
}
