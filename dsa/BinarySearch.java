
public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;

        int start = 0;
        int end = numbers.length - 1;

        int result = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (numbers[mid] == target) {
                result = mid;
                break;
            }

            else if (numbers[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
