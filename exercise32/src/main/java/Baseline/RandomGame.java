package Baseline;
import java.util.Random;
public class RandomGame {
     private int difficultyLevel;
     public RandomGame(int difficultyLevel){
         this.difficultyLevel = difficultyLevel;
     }
     //Create a menu method that'll call games
    void mainMenu(){
        //Prompt user to enter difficulty

        //Create loop to trap user until they have a correct input

        //right input, call function
    }

    //Create a function for first level
    void theGame() {
         Random rand = new Random();
         int randomNumber;
        //Generate random number between certain numbers depending the level
        switch (this.difficultyLevel){
            case 1:
                randomNumber = rand.nextInt(10);
                break;
            case 2:
                randomNumber = rand.nextInt(100);
                break;
            case 3:
                randomNumber = rand.nextInt(1000);
                break;
        }

        //Trap user in loop until they get it right

        //prompt if its' higher or lower
    }
}
