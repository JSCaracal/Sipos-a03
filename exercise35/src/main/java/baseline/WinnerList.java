package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WinnerList {
    private static Scanner input = new Scanner(System.in);
    private ArrayList<String>winners = new ArrayList<>();
    Random rand = new Random();
    //Create constructor
    public WinnerList(){

    }
    public WinnerList(ArrayList<String> winners){
        this.winners = winners;
    }
    //Have user input names via method
    void nameEnter(){
        //Trap the user in a while loop until blank is reached
        while(true){
            System.out.print("Enter a name: ");
            String name = input.nextLine();
            if(name.equals("")){
                break;
            }
            else{
                winners.add(name);
            }
        }
    }

    //RNG Function
    public void pickAWinner(){

        int winningNumber = rand.nextInt(winners.size());
        System.out.print("The winner is.... " +winners.get(winningNumber));
    }

    //Testing purposes only
    public ArrayList<String> getWinners() {
        return winners;
    }

    public void setWinners(ArrayList<String> winners) {
        this.winners = winners;
    }
}
