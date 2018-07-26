package strategy;

/**
 * Multiplies two numbers: a x b
 */
class MultiplyOperation implements  MathOperation{
    @Override
    public int performOperation(int a, int b) {
        return a * b;
    }
}
