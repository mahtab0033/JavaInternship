
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<String, Integer> students = new TreeMap<>();

        students.put("Rahul", 75);
        students.put("Aman", 85);
        students.put("Rohit", 90);
        students.put("Vikas", 65);
        students.put("Mohit", 80);

        System.out.println("Student Records:");

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }

        System.out.println("First Student: " + students.firstKey());
        System.out.println("Last Student: " + students.lastKey());

        students.put("Rahul", 95);

        System.out.println("Updated Rahul Marks: " + students.get("Rahul"));

        students.remove("Vikas");

        System.out.println("After Removing Vikas: " + students);

        System.out.println("Total Students: " + students.size());
    }
}

