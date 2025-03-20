import java.util.Scanner;
import java.util.StringTokenizer;

public class PolynomialEvaluator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a polynomial in standard f(x) notation");
        String polynomial = input.nextLine();

        System.out.println("Please enter an x value for the polynomial");
        int x = input.nextInt();

        StringTokenizer st = new StringTokenizer(polynomial);
        while (st.hasMoreTokens()) {
            
            System.out.println(st.nextToken());
        }
    }
}