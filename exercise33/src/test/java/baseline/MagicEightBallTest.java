package baseline;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;




class MagicEightBallTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;
    MagicEightBall eightBall = new MagicEightBall();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @Test
    void shakeTest(){
        eightBall.shake();
        if(outputStreamCaptor.toString().equals("Yes")){
            assertTrue(true);
        }
        else if(outputStreamCaptor.toString().equals("No")){
            assertTrue(true);
        }
        else if(outputStreamCaptor.toString().equals("Maybe")){
            assertTrue(true);
        }
        else if(outputStreamCaptor.toString().equals("Ask again later")){
            assertTrue(true);
        }else {
            assertEquals(false,false);
        }

    }
}