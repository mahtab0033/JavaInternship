
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(12);
        numbers.add(7);
        numbers.add(4);
        numbers.add(9);
        numbers.add(16);
        numbers.add(5);
        numbers.add(20);
        numbers.add(3);

        System.out.println("Original List: " + numbers);

        Iterator<Integer> it = numbers.iterator();

        int sum = 0;

        while (it.hasNext()) {

            int num = it.next();

            if (num % 2 == 0) {
                it.remove();
            } else {
                sum += num;
            }
        }

        System.out.println("Odd Numbers: " + numbers);
        System.out.println("Sum of Odd Numbers: " + sum);
        System.out.println("Final List Size: " + numbers.size());
    }
}
