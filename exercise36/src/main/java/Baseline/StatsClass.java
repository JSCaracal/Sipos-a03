package Baseline;

import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StatsClass {
    private ArrayList<Integer> inputs = new ArrayList<Integer>();
    private static Scanner input = new Scanner(System.in);
    //Create a class that handles inputs
    void inputHandling(){
        String in;
        while (true){
            System.out.print("Please enter a number: ");
            in = input.next();
            if(in.equals("done")){
                break;
            }
            else{
                try{
                    inputs.add(Integer.parseInt(in));
                }catch (NumberFormatException e){
                    System.out.print("Please enter a valid number: ");
                    input.next();
                }
            }

        }
    }
    //Following requirements, create an average function
    double average(){
        //Add all numbers and return based on size of the arraylist
        int summation = 0;
        double avg;
        for(int i = 0; i < inputs.size();i++){
            summation+= inputs.get(i);
        }
        avg = ((double)summation)/((double)inputs.size());
        return avg;
    }
    //Max
    int max(){
        //Classic loop and keep the highest
        int max = 0;
        for(int i = 0; i < inputs.size();i++){
            if(inputs.get(i) > max){
                max = inputs.get(i);
            }
        }
        return max;
    }
    //Min
    int min(){
        //Max but return the lowest
        int min = inputs.get(0);
        for(int i = 0; i < inputs.size();i++){
            if(inputs.get(i) < min){
                min = inputs.get(i);
            }
        }
        return min;
    }
    //Deviation
    double std(){
        double summation,std;
        summation = 0;
        std = 0;
        for(int i = 0; i < inputs.size();i++){
            summation+= inputs.get(i);
        }
        double avg = average();
        for(int i = 0; i < inputs.size(); i++){
            std += Math.pow(inputs.get(i)-avg,2);
        }
        return std;
    }
    void printList(){
        System.out.println("Numbers: "+inputs.toString());
    }

}
