package Baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
        @Test
    public void test_hasLetters(){
            Solution25 s25 = new Solution25();
            String pass = "abc";
            boolean t1 = s25.hasLetters(pass);
            boolean expectedT1 = true;
            assertEquals(expectedT1,t1);
        }
    @Test
    public void test_hasNumbers(){
        Solution25 s25 = new Solution25();
        String pass1 = "123";
        String pass2 = "aaa";
        boolean test1 = s25.hasNumbers(pass1);
        boolean test2 = s25.hasNumbers(pass2);
        boolean expectedt1 = true;
        boolean expectedt2 = false;
        assertEquals(expectedt1,test1);
        assertEquals(expectedt2,test2);
    }
    @Test
    public void test_hasNumsAndLetters(){
        Solution25 s25 = new Solution25();
        String pass1 = "123aaa34";
        String pass2 = "aaaaaaa";
        boolean test1 = s25.hasNumsAndLetters(pass1);
        boolean test2 = s25.hasNumsAndLetters(pass2);
        boolean expectedt1 = true;
        boolean expectedt2 = false;
        assertEquals(expectedt1,test1);
        assertEquals(expectedt2,test2);
    }
    @Test
    public void test_specialCharacters(){
        Solution25 s25 = new Solution25();
        String pass1 = "ae432%$";
        String pass2 = "aaaaaaa";
        boolean test1 = s25.specialCharacters(pass1);
        boolean test2 = s25.specialCharacters(pass2);
        boolean expectedt1 = true;
        boolean expectedt2 = false;
        assertEquals(expectedt1,test1);
        assertEquals(expectedt2,test2);
    }
    @Test
    public void test_lessThanEight(){
        Solution25 s25 = new Solution25();
        String pass2 = "ae432%$12";
        String pass1 = "aaaaa";
        boolean test1 = s25.lessThanEight(pass1);
        boolean test2 = s25.lessThanEight(pass2);
        boolean expectedt1 = true;
        boolean expectedt2 = false;
        assertEquals(expectedt1,test1);
        assertEquals(expectedt2,test2);
    }
    @Test
    public void test_passwordValidator(){
        Solution25 s25 = new Solution25();
        String pass1 = "ae432%$12";
        String pass2 = "aaaaa";
        String pass3 = "1337h@xor";
        int expectedt1 = 4;
        int expectedt2 = 2;
        int expectedt3 = 4;
        int test1 = s25.passwordValidator(pass1);
        int test2 = s25.passwordValidator(pass2);
        int test3 = s25.passwordValidator(pass3);
        assertEquals(expectedt1,test1);
        assertEquals(expectedt2,test2);
        assertEquals(expectedt3,test3);
    }
}