package baseline;
import java.util.Random;
import java.util.Scanner;
/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 Joshua Sipos
 *
 */
public class RandomGame {

    public RandomGame(){

    }

    private static final Scanner input = new Scanner(System.in);
     private int difficultyLevel;
     Random rand = new Random();
     public RandomGame(int difficultyLevel){
         this.difficultyLevel = difficultyLevel;
     }
     //Create a menu method that'll call games

    public int firstLoop(){
        int randomNumber = 0;
        switch (this.difficultyLevel) {
            case 1:
                randomNumber = rand.nextInt(10) + 1;
                break;
            case 2:
                randomNumber = rand.nextInt(100) + 1;
                break;
            case 3:
                randomNumber = rand.nextInt(1000) + 1;
                break;
            default:
                break;
        }
        return randomNumber;
    }

    //Create a function for first level
    void theGame() {

        //Generate random number between certain numbers depending the level
        int randomNumber = firstLoop();
        //Trap user in loop until they get it right
        int guess =1 ;
        int numOfGuesses = 0;
        System.out.println("I have my number, can you guess what it is?: ");
        do{
            try{
                guess = Integer.parseInt(input.next());
            }
            catch (NumberFormatException e){
                System.out.println("Not a numerical input");
                input.nextLine();
                guess++;
            }
            if(guess == randomNumber){
                System.out.printf("You got it in %d guesses!%n",numOfGuesses);
                break;
            }
            else if(guess > randomNumber){
                System.out.print("Too high, guess again!: ");
                numOfGuesses++;
            }
            else {
                System.out.print("Too low, guess again!: ");
                numOfGuesses++;
            }
        }while (true);
        //prompt if its' higher or lower

    }
}
