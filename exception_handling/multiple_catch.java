public interface multiple_catch {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {
            int result = numbers[1] / 0;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");

        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}

    

