package baseline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;

    @BeforeEach
    void initList(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void search() {

        Map<String,Employee>testMap = new HashMap<>();
        String[] fNames = {"John","Tou","Michaela","Jake","Jacquelyn","Sally"};
        String[] lNames = {"Johnson","Xiong","Michaelson","Jacobson","Jackson","Webber"};
        String[] pos = {"Manager","Software Engineer","District Manager","Programmer","DBA","Web Developer"};
        String[] dates = {"2016-12-31","2016-10-05","2015-12-19"," "," ","2015-12-18"};
        Employee emp = new Employee(fNames[4],lNames[4],pos[4],dates[4]);
        testMap.put(emp.getlName(),emp);
        Employee emp2 = new Employee(fNames[3],lNames[3],pos[3],dates[3]);
        testMap.put(emp2.getlName(),emp2);
        Employee testEmp = new Employee();
        testEmp.init();
        testEmp.search("Jac");

        assertEquals(testMap.containsKey("Jackson"),testEmp.getEmpMap().containsKey("Jackson"));
        assertEquals(testMap.containsKey("Jacobson"),testEmp.getEmpMap().containsKey("Jacobson"));


    }
}