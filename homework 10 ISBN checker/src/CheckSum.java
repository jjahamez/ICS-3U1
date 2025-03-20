import java.util.Scanner;

public class CheckSum {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input a 13 digit number");
        String number = input.next();
        int checkSum = 0;
        if (number.length() == 13) {
            for (int i = 10; i < 13; i += 2) {
                checkSum += Character.getNumericValue(number.charAt(1 + i)) * 3;
                checkSum += Character.getNumericValue(number.charAt(0 + i));
            }
            System.out.println(checkSum);
        } else {
            System.out.println("The number needs to be 13 digits");
        }
    }

}
