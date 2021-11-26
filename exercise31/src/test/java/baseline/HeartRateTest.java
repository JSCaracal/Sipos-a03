/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 Joshua Sipos
 *
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeartRateTest {

    @Test
    void targetHeartRate() {
                HeartRate hRTest = new HeartRate(65,22);
                double expected = 131.5;
                assertEquals(131.5,hRTest.TargetHeartRate(50));
            }

        }
