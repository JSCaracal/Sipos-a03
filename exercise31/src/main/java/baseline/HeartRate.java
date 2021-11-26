/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 Joshua Sipos
 *
 */

package baseline;

import java.util.Scanner;

public class HeartRate {
    private static final Scanner input = new Scanner(System.in);
    private int restingPulse;
    private int age;

    public HeartRate(int rP, int a){
        this.age = a;
        this.restingPulse = rP;
    }

    //Use what the user has entered to decide the target heartRate
    public double TargetHeartRate(int intensity){
        double percentage = (double) (intensity/100.0);
        double dAge = (double) age;
        double dRP = (double) restingPulse;
        return (((220-dAge)-dRP)*percentage) + dRP;
    }

    //Method to create the output and equation
    public void HeartRateChart(){
        System.out.printf("Resting Pulse: %d\t Age: %d \n\n",restingPulse, age);
        System.out.printf("Intensity\t|\t Rate\n");
        System.out.printf("------------|--------\n");
        for(int i = 55;i <= 95;i++){
            System.out.printf("%d%% \t\t| %d bpm\n",i,Math.round(TargetHeartRate(i)));
        }
    }


}
