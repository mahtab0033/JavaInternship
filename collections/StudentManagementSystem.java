
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> students = new HashMap<>();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    students.put(name, marks);

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("Student Records:");

                        for (Map.Entry<String, Integer> entry
                                : students.entrySet()) {

                            System.out.println(
                                entry.getKey() + " : " + entry.getValue()
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.nextLine();

                    if (students.containsKey(searchName)) {
                        System.out.println(
                            "Marks: " + students.get(searchName)
                        );
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter student name: ");
                    String updateName = sc.nextLine();

                    if (students.containsKey(updateName)) {
                        System.out.print("Enter new marks: ");
                        int newMarks = sc.nextInt();

                        students.put(updateName, newMarks);

                        System.out.println("Marks updated successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter student name to delete: ");
                    String deleteName = sc.nextLine();

                    if (students.containsKey(deleteName)) {
                        students.remove(deleteName);
                        System.out.println("Student deleted successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 6:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
