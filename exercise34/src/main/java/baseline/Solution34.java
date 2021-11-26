package baseline;
/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 Joshua Sipos
 *
 */
import java.util.Scanner;

public class Solution34 {
    //Have user input the name for removal
    private static final Scanner input = new Scanner(System.in);
    String removeEmployee(){
        System.out.print("Please enter the employee you want to remove: ");
        return input.nextLine();

    }
    public static void main(String[] args) {
        Solution34 s34 = new Solution34();
        EmployeeList empList = new EmployeeList();
        empList.printList();
        String employeeR = s34.removeEmployee();
        empList.removeEmployee(employeeR);
        empList.printList();

    }
}

