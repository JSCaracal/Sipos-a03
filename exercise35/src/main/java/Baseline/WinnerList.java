package Baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WinnerList {
    private static Scanner input = new Scanner(System.in);
    private ArrayList<String>winners = new ArrayList<String>();
    //Create constructor
    public WinnerList(){

    }
    //Have user input names via method
    void nameEnter(){
        //Trap the user in a while loop until blank is reached
        while(true){
            System.out.print("Enter a name: ");
            if(input.next() == ""){
                break;
            }
            else{
                winners.add(input.next());
            }
        }
    }

    //RNG Function
    void pickAWinner(){
        Random rand = new Random();
        int winningNumber = rand.nextInt(winners.size());
        System.out.println("The winner is.... " +winners.get(winningNumber));
    }


}
