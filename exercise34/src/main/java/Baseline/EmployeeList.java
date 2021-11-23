package Baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeList {
    //Initilize list of Employees, with names
    private String names[] = {"John Smith",
            "Jackie Jackson",
            "Chris Jones",
            "Amanda Cullen",
            "Jeremy Goodwin"};
    private List<String>nameList;
    public EmployeeList(){
        nameList = new ArrayList<String>(Arrays.asList(names));
    }
    //Method the input of employee removal
    public void removeEmployee(String emp){
        //Loop through Array
        for(int i = 0; i < nameList.size();i++){
            if(emp.equals(nameList.get(i))){
                nameList.remove(i);
                break;
            }
        }
    }
    //Print the list
    void printList(){
        System.out.println(nameList.toString());
    }

    public List<String> getNameList() {
        return nameList;
    }
}
