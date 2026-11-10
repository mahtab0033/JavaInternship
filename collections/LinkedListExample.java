
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        // Add elements
        tasks.add("Learn Java");
        tasks.add("Practice DSA");
        tasks.add("Learn Collections");

        System.out.println("Original Tasks: " + tasks);

        // Add at first position
        tasks.addFirst("Learn Programming");

        // Add at last position
        tasks.addLast("Learn Spring Boot");

        System.out.println("Updated Tasks: " + tasks);

        // Remove elements
        tasks.removeFirst();
        tasks.removeLast();

        System.out.println("After Removing: " + tasks);

        // Access first and last elements
        System.out.println("First Task: " + tasks.getFirst());
        System.out.println("Last Task: " + tasks.getLast());

        System.out.println("Total Tasks: " + tasks.size());
    }
}
