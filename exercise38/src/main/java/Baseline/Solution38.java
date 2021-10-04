package Baseline;

import java.util.ArrayList;

public class Solution38 {
    public static void main(String[] args) {

        Filter fill = new Filter();
        ArrayList<Integer>flop = fill.input();
        ArrayList<Integer>newFlop = fill.filterEvenNumbers(flop);
        System.out.println(newFlop.toString());


    }
}
