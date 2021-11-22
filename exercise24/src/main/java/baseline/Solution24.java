package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Sipos
 */
import java.util.Scanner;

public class Solution24 {
    public boolean isAnagram(String wordOne, String wordTwo){

        //If wordOne isn't the same length as wordTwo, the function returns false
        if(wordOne.length() != wordTwo.length()){
            return false;
        }else {
            for(char charString:wordOne.toCharArray()){
                String checker = Character.toString(charString);
                if(!wordTwo.contains(checker)) {
                    return false;
                }

            }
        }
        //For each loop will itterate through wordOne

        //Use the contains method to see if wordTwo contains the the letter itterating through
        //If wordTwo Doesn't contain the letter in word1, return false
        //Return true if all cases aren't false
        return true;
    }

    public static void main(String[] args) {
        String f1;
        String f2;
        Solution24 s24 = new Solution24();
        Scanner input = new Scanner(System.in);
        //Prompt user for first string
        System.out.print("Enter in your first string: ");
        f1 = input.next();
        //prompt for second
        System.out.print("Enter in your second string: ");
        //Store strings, and call the isAnagram method
        f2 = input.next();

        //Output the results.
        if(s24.isAnagram(f1,f2)){
            System.out.println(f1+" and "+f2 + " are anagrams");
        }
        else{
            System.out.println(f1+" and "+f2 + " are not anagrams");
        }
    }
}
