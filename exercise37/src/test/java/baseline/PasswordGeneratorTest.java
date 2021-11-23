package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {
    PasswordGenerator pGen;
    @BeforeEach
    void init(){
        pGen = new PasswordGenerator();
    }
    @Test
    void initLength() {
        pGen.initLength(10);
        assertEquals(10,pGen.getGeneratedPass().size());
    }

    @Test
    void fillWithRandomSpecials() {
        pGen.initLength(8);
        pGen.fillWithRandomSpecials(2);
        int specialCount = 0;
        for(Character c:pGen.getGeneratedPass()){
            if(!Character.isLetter(c)){
                specialCount++;
            }
        }
        assertEquals(2,specialCount);
    }

    @Test
    void fillWithNums() {
        pGen.initLength(8);
        pGen.fillWithRandomSpecials(2);
        pGen.fillWithNums(2);

        int numCount = 0;
        for(Character c:pGen.getGeneratedPass()){
            if(Character.isDigit(c)){
                numCount++;
            }
        }
        assertEquals(2,numCount);
    }
}