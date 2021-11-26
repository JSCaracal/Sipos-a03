package baseline;
import java.util.Scanner;

public class Solution26 {
    private static final Scanner input = new Scanner(System.in);
    //Ask user for input of n,i,b,p
    double userInput(String prompt){
        System.out.printf("What is %s ",prompt);
        return input.nextDouble();
    }

    public static void main(String[] args) {
        Solution26 s26 = new Solution26();
        double balance = s26.userInput("your balance?:");
        double dailyRate = s26.userInput("the APR on your card? (as a precent):");
        double monthlyPayment = s26.userInput("ths monthly payment you can make?: ");
        //Calculate The payment
        PaymentCalculator calculation = new PaymentCalculator(dailyRate,balance,monthlyPayment);
        //Output the results
        System.out.printf("It will take you %d months to pay off this card.",calculation.calculateMonthsUntilPaidOff());


    }
}
