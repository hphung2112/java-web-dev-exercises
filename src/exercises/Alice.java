package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String lowercaseAlice = alice.toLowerCase();

        System.out.println("Search: ");
        String searchTerm = input.nextLine();
        String lowercaseSearchTerm = searchTerm.toLowerCase();
        input.close();

        System.out.println(lowercaseAlice.contains(lowercaseSearchTerm));

        Integer index = alice.indexOf(searchTerm);
        Integer length = searchTerm.length();
        System.out.println("Your search term first appears at " + index + ". Your next one is " + length + " characters long.");
        String updatedAlice = alice.replace(searchTerm, "");
        System.out.println(updatedAlice);
    }
}
