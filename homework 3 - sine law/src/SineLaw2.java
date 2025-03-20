import java.util.Scanner;

public class SineLaw2 {
    public static void main(String[] args) {

        System.out.println("Please enter two sides and an angle(in degrees) of a triangle!");
        Scanner input = new Scanner(System.in);

        double sideA = input.nextDouble();
        double sideB = input.nextDouble();
        double angleAdeg = input.nextDouble();

        double angleArad = Math.toRadians(angleAdeg);

        double angleB = Math.toDegrees(Math.asin((sideB * Math.sin(angleArad) / sideA)));

        System.out.println("The missing angle is " + angleB + " degrees!");

        input.close();
    }
}
