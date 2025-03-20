import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Is the value of A true or false?");
        boolean A = input.nextBoolean();

        System.out.println("Is the value of B true or false?");
        boolean B = input.nextBoolean();

        System.out.println("Is the value of C true or false?");
        boolean C = input.nextBoolean();

        System.out.println("Is the value of D true or false?");
        boolean D = input.nextBoolean();

        boolean X = (A && B) || (C && D); // Condensed into one line versus two to save space
        boolean Y = (A && C) || (A && D); // Longer way would be to define A and B, A and C, etc. seperately
        boolean Z = (B && D) || (B && C);

        boolean output = (X || Y) || (Y || Z);
        System.out.println("The final output is " + output); // Min. of two trues to print true, otherwise false

        input.close();

    }
}
