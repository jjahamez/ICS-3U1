import java.util.Scanner;

public class SineLaw {
    public static void main(String[] args) {

        System.out.println("Please enter two sides and an angle(in degrees) of a triangle");
        Scanner sideA = new Scanner(System.in);
        Scanner sideB = new Scanner(System.in);
        Scanner angleA = new Scanner(System.in);

        double A = sideA.nextDouble();
        double B = sideB.nextDouble();
        double C = angleA.nextDouble();

        double radiansA = Math.toRadians(C);

        double angleB = Math.toDegrees(Math.asin((B * Math.sin(radiansA) / A)));

        System.out.println(angleB);

    }
}
