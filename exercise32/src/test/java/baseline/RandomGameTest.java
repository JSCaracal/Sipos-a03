package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomGameTest {
    RandomGame r = new RandomGame(1);
    RandomGame r2 = new RandomGame(2);
    RandomGame r3 = new RandomGame(3);
    @Test
    void firstLoop() {

        int t1;
        for(int i = 0; i < 1000;i++){
            t1 = r.firstLoop();
            if(t1 > 10){
                fail("Went above 10 when it shouldn't have");
            }
            if(t1 < 1){
                fail("T1 Went below 1");
            }
        }
        for(int i = 0; i < 100000;i++){
            t1 = r2.firstLoop();
            if(t1 > 100){
                fail("Went above 100");
            }
            if(t1 < 1){
                fail("Went below 1 in t2");
            }
        }
        for (int i = 0; i < 10000000; i++){
            t1 = r3.firstLoop();
            if(t1 > 1000){
                fail("Went above 1000");
            }
            if(t1 < 1){
                fail("T3 went below 0");
            }
        }
    }
}