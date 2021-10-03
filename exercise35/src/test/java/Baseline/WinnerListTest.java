package Baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class WinnerListTest {
    WinnerList list1;
    String[]lists = {"homer","marge","bart","lisa","maggie"};
    @BeforeEach
    void initList(){
        list1 = new WinnerList();
        ArrayList<String> winner = new ArrayList<String>();
        Collections.addAll(winner,lists);
    }
    @Test
    void testRandom(){
        boolean isTrue = true;
        assertTrue(isTrue);
    }

}