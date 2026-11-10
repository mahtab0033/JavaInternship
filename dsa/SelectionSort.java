
public class SelectionSort {

    public static void main(String[] args) {

        int[] numbers = {9, 4, 7, 2, 5};

        System.out.println("Before Sorting:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Selection Sort
        for (int i = 0; i < numbers.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap elements
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        System.out.println("\nAfter Sorting:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
