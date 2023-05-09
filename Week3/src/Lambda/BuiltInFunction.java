package Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class BuiltInFunction {
    private static HashMap<Integer,String> Employee=new HashMap<>();

    public static void add(String name,int ID){
        if(!Employee.containsKey(ID)){
            Employee.put(ID,name);
    }
    }

    public static void main(String[] args) {
        Function<Integer,String> get=(Integer ID)->{
            if(Employee.containsKey(ID))return Employee.get(ID);
            else return "Invalid ID";

        };
        add("Rishav",1091);
        add("Janavi",1092);
        add("Anjali",1093);
        add("Rohit",1094);

        for(Map.Entry<Integer,String> val :Employee.entrySet()){
            System.out.println(val);
        }
    }


}
