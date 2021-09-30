/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 Joshua Sipos
 *
 */

package Baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution31 {
    private static final Scanner input = new Scanner(System.in);
    //Create a class that handles a hearRateTarget Object
    //Contains resting pulse and age
    //see Heart Rate
    //Input
    HeartRate classInput(){
        int restingPulse =0 ;
        int age = 0;
        while(true){
            System.out.printf("Enter in your resting pulse: ");
            try{
                restingPulse = input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("You did not enter the correct input, try again");
                input.next();
                continue;
            }
            System.out.printf("Enter your age: ");
            try {
                age = input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("You did not enter the correct input, try again");
                input.next();
                continue;
            }
            break;
        }
        HeartRate rate = new HeartRate(restingPulse,age);
        return rate;
    }

    public static void main(String[] args) {
        Solution31 s31 = new Solution31();
        HeartRate HR = s31.classInput();
        HR.HeartRateChart();
    }
}
