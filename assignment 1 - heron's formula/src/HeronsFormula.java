import java.util.Scanner;

public class HeronsFormula {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter length of side A in a triangle");
        double A = input.nextDouble();

        System.out.println("Please enter length of side B in a triangle");
        double B = input.nextDouble();

        System.out.println("Please enter length of side C in a triangle");
        double C = input.nextDouble();
        input.close();

        double area = Math.sqrt(A * A * B * B * 4 - Math.pow(A * A + B * B - C * C, 2)) / 4; // Heron's Formula

        System.out.println("The area of the triangle is " + area + " units");

    }
}