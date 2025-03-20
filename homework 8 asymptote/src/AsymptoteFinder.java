import java.util.Scanner;

public class AsymptoteFinder {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the degree of the polynomial's numerator (M)");
        int M = input.nextInt();

        System.out.println("Please enter the degree of the polynomial's denominator (N)");
        int N = input.nextInt();

        if (M == N) {
            System.out.println("The asymptote is horizontal");
        } else if (N > M) {
            System.out.println("The asymptote is the X-Axis");
        } else {
            switch (M - N) {
                default:
                    System.out.println("too high i can only count to 10 B)"); // if (M-N is >10)
                    break;
                case 10:
                    System.out.println("The asymptote is Decic");
                    break;
                case 9:
                    System.out.println("The asymptote is Nonic");
                    break;
                case 8:
                    System.out.println("The asymptote is Octic");
                    break;
                case 7:
                    System.out.println("The asymptote is Septic");
                    break;
                case 6:
                    System.out.println("The asymptote is Sextic");
                    break;
                case 5:
                    System.out.println("The asymptote is Quintic");
                    break;
                case 4:
                    System.out.println("The asymptote is Quartic");
                    break;
                case 3:
                    System.out.println("The asymptote is Cubic");
                    break;
                case 2:
                    System.out.println("The asymptote is Quadratic");
                    break;
                case 1:
                    System.out.println("The asymptote is Linear");
                    break;
            }

        }
    }
}