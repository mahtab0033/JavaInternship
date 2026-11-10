
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Student Name: Mahtab\n");
            writer.write("Course: Java Programming\n");
            writer.write("College: Bansal Institute\n");

            writer.close();

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
