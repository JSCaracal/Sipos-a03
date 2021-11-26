package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsClassTest {
    StatsClass class1;
    @BeforeEach
    void init(){
        class1 = new StatsClass(100,200,300);
    }
    @Test
    void test_std(){
        assertEquals(81.64965809277261,class1.std());
    }

    @Test
    void test_average(){
        assertEquals(200,class1.average());
    }

}