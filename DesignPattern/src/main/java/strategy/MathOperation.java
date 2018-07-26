package strategy;

/**
 * interface for all math operations: add,sub and mult.
 * @FunctionalInterface: declares that this interface has only 1 abstract method.
 */
@FunctionalInterface
interface MathOperation {
    int performOperation(int a,int b);
}
