package baseline;


import java.util.*;

public class Employee {
    private String fName;
    private String lName;
    private String position;
    private String date;
    private Map<String,Employee> empMap = new HashMap<>();
    private Map<String,Employee> resultsMap = new HashMap<>();
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

    public Map<String, Employee> getResultsMap() {
        return resultsMap;
    }

    public void search(String query){
        //Loop through contents
        Map<String, Employee> contents = new HashMap<>(this.empMap);
        System.out.print("Name\t\t\t\tPosition\t\t\tDate\n");
        //If there is a match with.contains, print to screen
        for(Map.Entry<String, Employee> entry : contents.entrySet()){
            if(entry.getValue().lName.contains(query)){
                System.out.printf("%s %s\t\t%s\t\t%s%n",entry.getValue().fName,entry.getValue().lName,entry.getValue().position,entry.getValue().date);
                resultsMap.put(entry.getValue().lName,entry.getValue());
            }
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
