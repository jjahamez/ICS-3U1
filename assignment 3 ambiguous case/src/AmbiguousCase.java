import java.util.Scanner;

public class AmbiguousCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter Angle A(in degrees) of an SSA Triangle");
        double aDeg = input.nextDouble(); // Angle A in degree
        System.out.println("Please enter Side A of an SSA Triangle");
        double a = input.nextDouble();
        System.out.println("Please enter Side B of an SSA Triangle");
        double b = input.nextDouble();

        double aRad = Math.toRadians(aDeg); // Converts Angle A to radians
        double h = b * Math.sin(aRad);

        if (aDeg < 90) { // If the angle is acute
            if (a < h) {
                System.out.println("There are no possible triangles");
            } else if (a == h) {
                System.out.println("One possible right angle triangle");
            } else if (a > b) {
                System.out.println("One possible triangle");
            } else {    
                System.out.println("Two possible triangles(Ambiguous Case)");
            }
        } else if (aDeg > 90) { // If the angle is obtuse
            if (a < b || a == b) {
                System.out.println("There are no possible triangles");
            } else {
                System.out.println("One possible triangle");  
            }
        } else { 
            System.out.println("Invalid Input");
            }
        }   
    }