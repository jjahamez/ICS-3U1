import java.util.Scanner;

public class NANDGate {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Is the value of A true or false?");
        boolean A = input.nextBoolean();

        System.out.println("Is the value of B true or false?");
        boolean B = input.nextBoolean();

        System.out.println("Value C is " + !(A && B));
    }

}
