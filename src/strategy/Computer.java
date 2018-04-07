package strategy;

/**
 * The computer class is a class with many behaviors. instead of defining all it's operation in one file
 * we instead configure the class behavior to perform the wanted mathOperation. I.e add, sub or mult.
 */

class Computer {
    private MathOperation mathOperation;

    public Computer(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }

    public void setOperation(MathOperation mathOperation) {
        this.mathOperation = mathOperation;
    }


    public int compute(int a,int b) {
        return mathOperation.performOperation(a,b);
    }



}
