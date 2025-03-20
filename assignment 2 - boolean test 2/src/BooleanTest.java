import java.util.Scanner;

public class BooleanTest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Is the value of A true or false?");
        boolean a = input.nextBoolean();

        System.out.println("Is the value of B true or false?");
        boolean b = input.nextBoolean();

        System.out.println("Is the value of C true or false?");
        boolean c = input.nextBoolean();

        System.out.println("Is the value of D true or false?");
        boolean d = input.nextBoolean();
        input.close();
        
        boolean output = b && !d || !b && !c && d || !a && !b && !c || a && c && !d; 

        System.out.println("The final output is " + output); 
    }
}

// Dots represent and, Pluses represents or, and Lines represent inverse
// Copy line 19 into a Boolean Algebra Solver to Confirm: 
// B\overline{D}+\overline{B}\overline{C}D+\overline{A}\overline{B}\overline{C}+AC\overline{D}