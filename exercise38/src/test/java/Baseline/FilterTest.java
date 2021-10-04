package Baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilterTest {
    @BeforeEach
    void init(){
        ArrayList<Integer>t1 = new ArrayList<Integer>();
        for(int i = 0; i < 15;i++){
            t1.add(i);
        }
        ArrayList<Integer>s1 = new ArrayList<Integer>();
        for(int i = 0; i < 15; i+=2){
            t1.add(i);
        }

    }
    @Test
    void evenFilter_test(){
        Filter filterTest = new Filter();
    }
}