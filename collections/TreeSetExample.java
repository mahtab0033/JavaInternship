
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Sorted Numbers: " + numbers);

        System.out.println("First Element: " + numbers.first());

        System.out.println("Last Element: " + numbers.last());

        System.out.println("Higher than 20: " + numbers.higher(20));

        System.out.println("Lower than 40: " + numbers.lower(40));

        numbers.remove(30);

        System.out.println("After Removing 30: " + numbers);
    }
}
