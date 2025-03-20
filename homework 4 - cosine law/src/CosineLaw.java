import java.util.Scanner;

public class CosineLaw {
    public static void main(String[] args) {

        System.out.println("Please enter two sides and an angle(in degrees) of a triangle");
        Scanner input = new Scanner(System.in);

        double sideA = input.nextDouble();
        double sideB = input.nextDouble();
        double angleCdeg = input.nextDouble();

        double angleCrad = Math.toRadians(angleCdeg);

        double sideC = Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(angleCrad));
        System.out.println("The missing side is " + sideC + " units!");

        input.close();
    }
}
