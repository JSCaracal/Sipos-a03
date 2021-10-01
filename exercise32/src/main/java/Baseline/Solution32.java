package Baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution32 {
    private static final Scanner input = new Scanner(System.in);
    //Number game
    /*
    Create a menu that asks for the level of difficulty
    summon math.random
    if player choses their level, execute the level program
    have the player keep guessing and prompt them if their choice is too high or too low
    display result
    keep track of guesses

     */
    void mainMenu(){
        //Prompt user to enter difficulty
        int difficultyLevel = 1;
        while (true){
            System.out.printf("Enter the difficulty level (1, 2, or 3): ");
            try {
                difficultyLevel = input.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Wrong input");
                input.next();
                continue;
            }
            RandomGame game = new RandomGame(difficultyLevel);
            game.theGame();
            System.out.println("Would you like to play again? Y/N");
            String choice = input.next();
            if(choice.equals("N")){
                break;
            }
        }





        //Create loop to trap user until they have a correct input

        //right input, call function
    }

    public static void main(String[] args) {
        Solution32 s32 = new Solution32();
        s32.mainMenu();
    }
}
