import java.util.Scanner;

public class AmbiguousCase2 {
    public static void main(String[] args) {

        System.out.println("Please enter Side A of an SSA Triangle");
        double sideA = input.nextDouble();

        System.out.println("Please enter Side B of an SSA Triangle");
        double sideB = input.nextDouble();

        System.out.println("Please enter Angle A(in degrees) of an SSA Triangle");
        double angleAdeg = input.nextDouble(); // Angle A in degrees

        double angleArad = Math.toRadians(angleAdeg); // Converts Angle A to radians
        double h = b*Math.sin(angleArad)

        if (a<h) {
            System.out.println("There are no possible triangles");
        }
        else if (a==h) { 
            double angleB = Math.toDegrees(Math.asin((sideB * Math.sin(angleArad) / sideA)));
            System.out.println("Angle B of the right triangle is " + angleB);
        }
        else if (a>b) { 
            double angleB = Math.toDegrees(Math.asin((sideB * Math.sin(angleArad) / sideA)));
            System.out.println("Angle B of the one possible triangle is " + angleB);

        
        }


        

    }
}