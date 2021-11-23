package baseline;


import java.util.*;

public class Employee {
    private String fName;
    private String lName;
    private String position;
    private String date;
    private Map<String,Employee> empMap = new HashMap<String,Employee>();

    public Employee(String fName, String lName, String position, String date){
        this.fName = fName;
        this.lName = lName;
        this.position = position;
        this.date = date;
    }


    public Employee(){

    }
    public void init(){
        String[] fNames = {"John","Tou","Michaela","Jake","Jacquelyn","Sally"};
        String[] lNames = {"Johnson","Xiong","Michaelson","Jacobson","Jackson","Webber"};
        String[] pos = {"Manager","Software Engineer","District Manager","Programmer","DBA","Web Developer"};
        String[] dates = {"2016-12-31","2016-10-05","2015-12-19"," "," ","2015-12-18"};
        for(int i = 0; i < 6; i++){
            Employee emp = new Employee(fNames[i],lNames[i],pos[i],dates[i]);
            this.empMap.put(emp.getlName(),emp);
        }
    }
    public void printandSort(){
        Map<String, Employee> sorted = new TreeMap<String,Employee>(this.empMap);
        System.out.print("Name\t\t\t\tPosition\t\t\tDate\n");
        for(Map.Entry<String, Employee> entry : sorted.entrySet()){
            System.out.printf("%s %s\t\t%s\t\t%s%n",entry.getValue().fName,entry.getValue().lName,entry.getValue().position,entry.getValue().date);
        }


    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getPosition() {
        return position;
    }

    public String getDate() {
        return date;
    }
    public Map<String, Employee> getEmpMap() {
        return empMap;
    }

}
