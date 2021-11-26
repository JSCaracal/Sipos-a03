/*
 *
 *  *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  *  Copyright 2021 first_name last_name
 *
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee emp = new Employee("Joshua","Sipos","AA-1234",33325);
    @Test
    void nameValidator() {
        String test1 = "a";
        String test2 = "Josh";
        assertEquals(true,emp.nameValidator(test2));
        assertEquals(false,emp.nameValidator(test1));
    }

    @Test
    void zipValidator() {
        Employee test1 = new Employee("Joshua","Sipos","AA-1234",33325);
        Employee test2 = new Employee("Joshua","Sipos","AA-1234",333);
        assertEquals(false,test2.zipValidator());
        assertEquals(true,test1.zipValidator());
    }

    @Test
    void idValidator() {
        Employee test1 = new Employee("Joshua","Sipos","TK-4321",33325);
        Employee test2 = new Employee("Joshua","Sipos","A2-1234",333);
        Employee test3 = new Employee("Joshua","Sipos","A-1234",333);
        Employee test4 = new Employee("Joshua","Sipos","AA-A234",333);

        assertEquals(true,test1.idValidator());
        assertEquals(false,test2.idValidator());
        assertEquals(false,test3.idValidator());
        assertEquals(false,test4.idValidator());
    }

}