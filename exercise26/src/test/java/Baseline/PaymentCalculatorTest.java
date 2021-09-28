package Baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    public void caclulateMonthsUntilPaidOff_Test(){
        PaymentCalculator test1 = new PaymentCalculator(12,5000,100);
        PaymentCalculator test2 = new PaymentCalculator(10.3,2500.22,150.60);
        int expected1 = 70;
        int expected2 = 18;
        int actual1 = test1.calculateMonthsUntilPaidOff();
        int actual2 = test2.calculateMonthsUntilPaidOff();
        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
    }

}