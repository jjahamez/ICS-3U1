import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double sum = 0.0;

        System.out.println("Please enter a polynomial in standard f(x) notation | eg: [f(x)=9x^6 +1x^1 -5x^2 +2...]");
        String poly = input.nextLine().substring(5); // ignores f(x)= (first 5 characters)
        System.out.println("Please enter the x value");
        double x = input.nextDouble();
        input.close();

        StringTokenizer st = new StringTokenizer(poly, " "); // separates terms
        while (st.hasMoreTokens()) {
            String term = st.nextToken();  
            if (term.contains("x")) {
                double coefficient = Double.parseDouble(term.substring(0, term.indexOf('x')));
                int exponent = Integer.parseInt(term.substring(term.indexOf('^') + 1)); // determines if before x or after ^
                sum += coefficient * Math.pow(x, exponent); // if term has "x"
            } else {
                sum += Double.parseDouble(term); // constants
            }
        }
        System.out.println("f(" + x + ")= " + sum);
    }
}