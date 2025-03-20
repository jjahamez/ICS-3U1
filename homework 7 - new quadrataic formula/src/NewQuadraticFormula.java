import java.util.Scanner;

public class NewQuadraticFormula {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter value A of a Quadratic");
        double A = input.nextDouble();

        System.out.println("Please enter value B of a Quadratic");
        double B = input.nextDouble();

        System.out.println("Please enter value C of a Quadratic");
        double C = input.nextDouble();

        double Discriminant = ((B * B) - 4 * A * C);

        double root1 = (-B + Math.sqrt(B * B - (4 * A * C))) / (2 * A);
        double root2 = (-B - Math.sqrt(B * B - (4 * A * C))) / (2 * A);

        if (Discriminant < 0) {
            System.out.println("There are no real roots");    
        } else if (Discriminant == 0) {
            System.out.println("The real unique root is " + root1);
        } else {
            System.out.println("The two real roots are " + root1 + root2);
        }

        input.close();
    }
}
