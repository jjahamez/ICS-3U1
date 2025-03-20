import java.util.Scanner;

public class PIApproximation {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        repeat: while (true) {
        System.out.println("Please enter an n Value");
        double n = input.nextDouble();
        double sum = 0;
        double currentNumber = 0;    
        while (true) {
            sum += Math.pow(-1.0, currentNumber) / (2 * currentNumber + 1);
            currentNumber++;
            if (currentNumber == n) {
                System.out.println((4 * sum));
                System.out.println("Do you want to try again? [true/false]");
                    boolean answer = input.nextBoolean();
                    if (answer == true) {
                        continue repeat;
                    } else {
                        break repeat;
                    }
                }
            }
        }
    }
}
