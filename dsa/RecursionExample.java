
public class RecursionExample {

    // Factorial using recursion
    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // Fibonacci using recursion
    static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int number = 5;

        System.out.println("Factorial of " + number + ": "
                + factorial(number));

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < 7; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
