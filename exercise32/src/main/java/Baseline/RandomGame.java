package Baseline;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    private static final Scanner input = new Scanner(System.in);
     private int difficultyLevel;

     public RandomGame(int difficultyLevel){
         this.difficultyLevel = difficultyLevel;
     }
     //Create a menu method that'll call games


    //Create a function for first level
    void theGame() {
         Random rand = new Random();
         boolean isGame = true;
         int randomNumber = 0;
        //Generate random number between certain numbers depending the level
        switch (this.difficultyLevel){
            case 1:
                randomNumber = rand.nextInt(10)+1;
                break;
            case 2:
                randomNumber = rand.nextInt(100)+1;
                break;
            case 3:
                randomNumber = rand.nextInt(1000)+1;
                break;
        }

        //Trap user in loop until they get it right
        int guess =1 ;
        int numOfGuesses = 0;
        System.out.println("I have my number, can you guess what it is?: ");
        while(isGame){
            try{
                guess = input.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Not a numerical input");
            }
            if(guess == randomNumber){
                System.out.printf("You got it in %d guesses!\n",numOfGuesses);
                break;
            }
            else if(guess > randomNumber){
                System.out.printf("Too high, guess again!: ");
                numOfGuesses++;
            }
            else {
                System.out.printf("Too low, guess again!: ");
                numOfGuesses++;
            }
        }
        //prompt if its' higher or lower

    }
}
