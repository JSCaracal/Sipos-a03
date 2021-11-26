
/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 Josua Sipos
 *
 */

package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution29 {
    //Create an input function per variable that loops until the input matches requirements
    private static final Scanner input = new Scanner(System.in);

    //Rate of return
    int inputRate() {
        int rate = 0;
        boolean isValid = false;
        //Do basic true loop
        do{
            System.out.printf("Enter the input rate: ");
            try{
                rate = input.nextInt();
                if(rate == 0){
                    System.out.println("Please enter a numerical value above zero");
                    continue;
                }
                isValid = true;
            }catch (InputMismatchException e){
                System.out.println("Please enter a numerical value");
                input.next();
            }

        }while (!isValid);
        return rate;
    }

    void returnRateCalculation(int rate){
        System.out.printf("It will take %d years to double your initial investment",72/rate);
    }



        public static void main (String[]args){
            Solution29 s29 = new Solution29();
            int rate = s29.inputRate();
            s29.returnRateCalculation(rate);

        }

    }