import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Addition
        BinaryOperator<Integer> addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.apply(5, 3));

        // Subtraction
        BinaryOperator<Integer> subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.apply(5, 3));

        // Multiplication
        BinaryOperator<Integer> multiplication = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiplication.apply(5, 3));

        // Division
        BinaryOperator<Integer> division = (a, b) -> a / b;
        System.out.println(" ");

        //task 2
        Greeting hello = name -> "Hello, " + name;
        System.out.println(hello.greet("Leyla"));


        Bye goodbye = name -> "Goodbye, " + name;
        System.out.println(goodbye.sayGoodbye("Mary"));

        //task 3
        // Predicate a number is even by using % operator
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Function converts integer into a string
        Function<Integer, String> intToString = num -> "Number: " + num;
        System.out.println(intToString.apply(10));

        // Consumer prints a message
        Consumer<String> stringPrinter = message -> System.out.println("Printed message: " + message);
        stringPrinter.accept("How are ya? :)");

        // Supplier returns a random double
        Supplier<Double> randomDouble = () -> Math.random();
        System.out.println("Random double: " + randomDouble.get());
    }

    @FunctionalInterface
    public interface Greeting {
        String greet(String name);
    }

    @FunctionalInterface
    public interface Bye {
        String sayGoodbye(String name);
    }
}

