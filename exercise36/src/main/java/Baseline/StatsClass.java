package Baseline;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StatsClass {
    private ArrayList<Integer> inputs = new ArrayList<Integer>();
    private static Scanner input = new Scanner(System.in);
    //Create a class that handles inputs
    void inputHandling(){
        while (true){
            System.out.print("Please enter a number");
            try{
                inputs.add(input.nextInt());
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Please enter a full number: ");
                input.next();
            }
        }
    }
    //Following requirements, create an average function
    int average(){
        //Add all numbers and return based on size of the arraylist
        return 0;
    }
    //Max
    int max(){
        //Classic loop and keep the highest
        return 0;
    }
    //Min
    int min(){
        //Max but return the lowest
        return 0;
    }
    //Deviation
    double std(){
        //Math std
        return 0.0;
    }

}
