import java.util.Scanner;

public class integer {

    public static void main(String[] args) {

        System.out.println("Please input a decimal ");
        Scanner keyboard = new Scanner(System.in);

        // Use this to read an integer

        int input = (int) keyboard.nextDouble();
        keyboard.close();

        System.out.println("Your decimal rounded down is " + input);

    }

}