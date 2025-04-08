import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        BufferedReader inputStream = null;
        String line;
        HashSet<String> words = new HashSet<>();

        try {
            inputStream = new BufferedReader(new FileReader("dictionary.txt"));
            while ((line = inputStream.readLine()) != null) {
                words.add(line);
            }
            System.out.println("Please input a sentence in English (no punctuation): ");
            String[] sentence = input.nextLine().toLowerCase().trim().replaceAll("\\s+", " ").split(" "); // split by space
            for (int i = 0; i < sentence.length; i++) { // counter for word
                if (words.contains(sentence[i])) {
                    System.out.println((i + 1) + ". " + sentence[i] + " <valid>");
                } else {
                    System.out.println((i + 1) + ". " + sentence[i] + " <invalid>");
                }
            }
        } catch (FileNotFoundException err) {
            System.out.println("Error opening File");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            input.close();
        }
    }
}