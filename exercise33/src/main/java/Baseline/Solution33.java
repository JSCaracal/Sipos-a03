package Baseline;

import java.util.Scanner;

public class Solution33 {
    /*
    Magic 8 ball
    Arrays are great for storing possible responses from a program.
    If you combine that with a random number generator, you can pick a random entry from this list, which works great
    for games.
    Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again
    later."
     */

    //Create Magic 8 ball class
    //It shall contain an RNG
    //It shall generate 1-4
    //It shall output the result.
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What is your question?: ");
        MagicEightBall ball = new MagicEightBall();
        input.next();
        ball.shake();

    }
}
