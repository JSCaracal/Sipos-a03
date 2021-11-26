package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Joshua Sipos
 */
public class Solution30 {
    //Create a function that handles the table
    void printMultiplicationTable(){
        //for loop that includes 12
        int product;
        for(int i = 1; i <= 12; i++){
            //Make another loop the represents collums, multiply by the first number
            for(int j = 1; j <=12;j++){
                product = i*j;
                if(product < 10){
                    System.out.printf("%d   ",product);
                }
                else if(product < 100 && product >= 10) {
                    System.out.printf("%d  ",product);
                }
                else {
                    System.out.printf("%d ",product);
                }
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Solution30 s30 = new Solution30();
        s30.printMultiplicationTable();
    }
}


