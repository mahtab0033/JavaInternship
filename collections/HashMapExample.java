
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        students.put("Rahul", 75);
        students.put("Aman", 85);
        students.put("Rohit", 90);
        students.put("Vikas", 65);
        students.put("Mohit", 80);

        System.out.println("Student Records:");

        int totalMarks = 0;

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

            totalMarks += entry.getValue();
        }

        System.out.println("Total Marks: " + totalMarks);

        students.put("Rahul", 95);

        System.out.println("Updated Rahul Marks: " + students.get("Rahul"));

        students.remove("Vikas");

        System.out.println("After Removing Vikas: " + students);
        System.out.println("Total Students: " + students.size());
    }
}
