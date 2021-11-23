package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee emp = new Employee();
    @Test
    void init() {
        emp.init();
        Map<String,Employee> testEmp = new HashMap<>(emp.getEmpMap());
        assertEquals(testEmp.toString(),emp.getEmpMap().toString());
    }
}