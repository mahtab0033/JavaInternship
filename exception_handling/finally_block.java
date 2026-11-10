public interface finally_block {
    

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Exception: Division by zero!");

        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

