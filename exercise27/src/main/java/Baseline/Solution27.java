/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 Joshua Sipos
 *
 */
/*

Write a program that prompts for a first name, last name, employee ID, and ZIP code.
Ensure that the input is valid according to these rules:
The first name must be filled in.
The last name must be filled in.
The first and last names must be at least two characters long.
An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
The ZIP code must be a number.


 */

package Baseline;

import java.util.Scanner;

public class Solution27 {
    private static final Scanner input = new Scanner(System.in);
    //Create a Class the contains the fields
    //With in that class attempt exception handling if invalid credentials are entered
    //Get credentials using an input method
    public Employee inputEmployee(){
        System.out.printf("Please enter your first name: ");
        String fName = input.next();
        System.out.printf("Please enter your last name: ");
        String lName = input.next();
        System.out.printf("Please enter your id: ");
        String id = input.next();
        System.out.printf("Please enter your zip code: ");
        int zip = input.nextInt();
        Employee out = new Employee(fName,lName,id,zip);
        return out;

    }
    public static void main(String[] args) {
        Solution27 s27 = new Solution27();
        Employee emp = s27.inputEmployee();
        emp.validateInput(emp);
    }

}
