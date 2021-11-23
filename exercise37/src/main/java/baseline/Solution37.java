package baseline;

import java.util.Scanner;

public class Solution37 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        PasswordGenerator pGen = new PasswordGenerator();
        System.out.print("Please enter the min length: ");
        int length = input.nextInt();
        System.out.print("Please enter the special character count: ");
        int specials = input.nextInt();
        System.out.print("Please enter the number count: ");
        int numCount = input.nextInt();
        pGen.generatePass(length,specials,numCount);
        System.out.println();

    }
}
