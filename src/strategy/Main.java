package strategy;

/**
 * Behavioiral design pattern
 * usu to:
 * avoid exposure of complicated algortihms.
 * many different types of algorithms. code will be cleaner and modular.
 */
class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(new AdditionOperation());
        System.out.println(computer.compute(10, 4));
        computer.setOperation(new SubtractionOperation());
        System.out.println(computer.compute(10, 4));
        computer.setOperation(new MultiplyOperation());
        System.out.println(computer.compute(10, 4));
    }
}
