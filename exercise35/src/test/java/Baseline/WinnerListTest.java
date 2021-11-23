package Baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class WinnerListTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;
    WinnerList list1;
    String[]lists = {"homer","marge","bart","lisa","maggie"};
    ArrayList<String> winner;
    @BeforeEach
    void initList(){
        winner = new ArrayList<String>(Arrays.asList(lists));
        list1 = new WinnerList(winner);
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    @Test
    void testRandom(){
        list1.pickAWinner();
        if(outputStreamCaptor.toString().equals("The winner is.... lisa")){
            assertEquals("The winner is.... lisa",outputStreamCaptor.toString());
        }
        else if(outputStreamCaptor.toString().equals("The winner is.... bart")){
            assertEquals("The winner is.... bart",outputStreamCaptor.toString());
        }
        else if(outputStreamCaptor.toString().equals("The winner is.... marge")){
            assertEquals("The winner is.... marge",outputStreamCaptor.toString());
        }
        else if(outputStreamCaptor.toString().equals("The winner is.... homer")){
            assertEquals("The winner is.... homer",outputStreamCaptor.toString());
        }
        else if(outputStreamCaptor.toString().equals("The winner is.... maggie")){
            assertEquals("The winner is.... maggie",outputStreamCaptor.toString());
        }
        else {
            assertEquals("Failed",outputStreamCaptor.toString());
        }

    }

}