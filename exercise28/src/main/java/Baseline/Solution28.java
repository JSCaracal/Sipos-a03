/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 Joshua Sipos
 *
 */

package Baseline;

import java.util.Scanner;
//Loop through inputs
//Add the inputs
public class Solution28 {
    public static final Scanner input = new Scanner(System.in);
    int[] numberInputs(){
        int[] numbers = new int[5];
        for(int i = 0; i < 5;i++){
            System.out.println("Enter in a number: ");
            numbers[i] = input.nextInt();
        }
        return numbers;
    }
    public int addition(int[] numbers){
        int summation = 0;
        for (int i = 0; i < numbers.length; i++) {
            summation += numbers[i];
        }
        return summation;
    }

    public static void main(String[] args) {
        Solution28 s28 = new Solution28();
        int[]numbers = s28.numberInputs();
        int finalAnswer = s28.addition(numbers);
        System.out.printf("The total is: %d",finalAnswer);


    }
}
