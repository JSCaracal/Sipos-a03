/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 Joshua Sipos
 *
 */

package Baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
Solution28 s28 = new Solution28();

    @Test
    void addition() {
        int test1 = 15;
        int[] testArray = {1,2,3,4,5};
        assertEquals(test1,s28.addition(testArray));

    }
}