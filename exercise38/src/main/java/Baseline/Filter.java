package Baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Filter {
    private static final Scanner input = new Scanner(System.in);
    public Filter(){

    }
    //Handle input with a method. Turn it into an array and return
    ArrayList<Integer> input(){
            System.out.print("Please enter in numbers separated by spaces: ");
            String in = input.nextLine();
            String[]str = in.split(" ");
            ArrayList<Integer>nums = new ArrayList<Integer>();
            for(int i = 0; i < str.length;i++){
                nums.add(Integer.parseInt(str[i]));
            }
            return nums;
    }
    //Create Filter Evenums
    
}
