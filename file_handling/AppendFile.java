
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("student.txt", true);

            writer.write("\nStudent Email: mahtab@example.com");
            writer.write("\nStatus: Active");

            writer.close();

            System.out.println("Data appended successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
