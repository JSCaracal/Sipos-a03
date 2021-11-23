package Baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {
    @Test
    void removal_Test(){
        String exepected[] = {"John Smith",
                "Jackie Jackson",
                "Amanda Cullen",
                "Jeremy Goodwin"};
        ArrayList<String> listA = new ArrayList<>(Arrays.asList(exepected));

        EmployeeList testObject = new EmployeeList();
        testObject.removeEmployee("Chris Jones");
        assertEquals(listA.toString(),testObject.getNameList().toString());
    }
}