
import java.util.*;

public class StringAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STRING ANALYZER SYSTEM =====");

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Reverse String");
            System.out.println("2. Palindrome Check");
            System.out.println("3. Count Vowels");
            System.out.println("4. Count Characters");
            System.out.println("5. Count Words");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    String reverse = new StringBuilder(str)
                            .reverse().toString();
                    System.out.println("Reverse: " + reverse);
                    break;

                case 2:
                    String clean = str.replaceAll(
                            "[^a-zA-Z0-9]", "").toLowerCase();

                    String reversed = new StringBuilder(clean)
                            .reverse().toString();

                    if (clean.equals(reversed)) {
                        System.out.println("Palindrome String");
                    } else {
                        System.out.println("Not a Palindrome");
                    }
                    break;

                case 3:
                    int vowels = 0;

                    for (int i = 0; i < str.length(); i++) {
                        char ch = Character.toLowerCase(str.charAt(i));

                        if (ch == 'a' || ch == 'e' ||
                            ch == 'i' || ch == 'o' ||
                            ch == 'u') {
                            vowels++;
                        }
                    }

                    System.out.println("Total Vowels: " + vowels);
                    break;

                case 4:
                    System.out.println(
                            "Total Characters: " + str.length());
                    break;

                case 5:
                    String trimmed = str.trim();

                    int words = trimmed.isEmpty()
                            ? 0 : trimmed.split("\\s+").length;

                    System.out.println("Total Words: " + words);
                    break;

                case 6:
                    System.out.println(
                            "Thank you for using String Analyzer!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
