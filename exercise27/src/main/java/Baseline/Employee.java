/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 Joshua Sipos
 *
 */

package Baseline;


public class Employee {
    private String firstName;
    private String lastName;
    private String id;
    private int zipCode;


    public Employee(String fName, String lName, String id, int zCode){
            this.firstName = fName;
            this.lastName = lName;
            this.id = id;
            this.zipCode = zCode;
    }
    //Create sub functions that validate the program
    public boolean nameValidator(String name){
        if(name.length() < 2){
            return false;
        }
        return true;
    }
    public boolean zipValidator(){
        String zip = Integer.toString(zipCode);
        if( zip.length()!=5){
            return false;
        }else {
            return true;
        }

    }
    public boolean idValidator(){
        //Is it the id the length of 2 letters,1 hyphen, and 4 nums?
        if(id.length() != 7){
            return false;
        }
        //Go char by char
        for(int i = 0; i < id.length(); i++){
            //Check the first 2
            if(i < 2 && !(Character.isLetter(id.charAt(i)))){
                System.out.println("Executed prehyphen");
                    return false;
            }
            //Checks for Hyphon
            if(i == 2 && id.charAt(i) != 45 ){
                System.out.println("Executed hyphon");
                    return false;
                }
            //Check for the last 4 numbs
            if(i > 2 && !(id.charAt(i) >= 48 && id.charAt(i) <= 57)){
                System.out.println("Executed post");
                    return false;
                }

        }
        return true;
    }


    //Create id validator
    void validateInput(Employee employee){
        boolean valid = true;
        if(!employee.nameValidator(employee.firstName)){
            System.out.print("The first name must be 2 characters long\n");
            valid = false;
        }
        if(!employee.nameValidator(employee.lastName)){
            System.out.print("The last name must be 2 characters long\n");
            valid = false;
        }
        if(!employee.idValidator()){
            System.out.print("The id must be in the format of: AA-1234\n");
            valid = false;
        }
        if(!zipValidator()){
            System.out.println("The Zip code must be a 5 digit number");
            valid = false;
        }
        if(valid){
            System.out.println("There were no errors found");
        }
    }
}
