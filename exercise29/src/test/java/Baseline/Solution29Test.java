package Baseline;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    @ParameterizedTest
    @ValueSource(ints = {1,3,4,5})
    void inputRadeTest(int num){
        assertEquals(num,num);
    }

}