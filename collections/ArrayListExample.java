
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(83);
        marks.add(90);
        marks.add(65);
        marks.add(88);

        int total = 0;
        int highest = marks.get(0);

        for (int mark : marks) {
            total += mark;

            if (mark > highest) {
                highest = mark;
            }
        }

        System.out.println("Student Marks: " + marks);
        System.out.println("Total Marks: " + total);
        System.out.println("Highest Marks: " + highest);

        marks.add(95);

        System.out.println("Updated Marks: " + marks);
    }
}
