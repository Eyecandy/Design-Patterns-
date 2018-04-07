package strategy;

/**
 * Subtracts two numbers: a - b
 */
class SubtractionOperation implements  MathOperation {
    @Override
    public int performOperation(int a, int b) {
        return a - b;
    }
}
