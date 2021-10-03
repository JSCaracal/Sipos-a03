package Baseline;

import java.time.temporal.ChronoField;
import java.util.ArrayList;

public class PasswordGenerator {
    //create a list that will be used to store characters
    private ArrayList<Character>specialCharacters = new ArrayList<Character>();
    private ArrayList<Character>letters = new ArrayList<Character>();
    private ArrayList<Character>numbers = new ArrayList<Character>();
    private int minPassword;
    private int specialCount;
    private int numCount;
    private String password;
    public void init(){
        specialCharacters.add('%');
    }
    //input method that sets the values
    public void inputVals(){

    }
    //Number gen
    public int RNG(int high, int low){
        return 0;
    }
    //Tests to see if the string has enough letters
    boolean hasMoreLetters(){
        return false;
    }
}
