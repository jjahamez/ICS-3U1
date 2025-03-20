import java.util.Scanner;

public class CosineLaw2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter side A");
        double sideA = input.nextDouble();

        System.out.println("Please enter side B");
        double sideB = input.nextDouble();

        System.out.println("Please enter angle C(in degrees)");
        double angleCdeg = input.nextDouble();

        double angleCrad = Math.toRadians(angleCdeg);

        double sideC = Math.sqrt(sideA * sideA + sideB * sideB - 2 * sideA * sideB * Math.cos(angleCrad));
        System.out.println("Side C is " + sideC + " units");

        input.close();
    }
}