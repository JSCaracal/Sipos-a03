import baseline.Solution24;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @org.junit.jupiter.api.Test
    void isAnagram() {
        Solution24 s24 = new Solution24();
        String test1 = "note";
        String test2 = "tone";
        String test3 = "flop";
        String test4 = "mlop";
        assertEquals(true,s24.isAnagram(test1,test2));
        assertEquals(false,s24.isAnagram(test3,test4));

    }
}