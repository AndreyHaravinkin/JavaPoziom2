package pl.sda.javaPoziom2.lista;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Company {
    Map<Integer, String> mapOfEmployees = new HashMap<Integer, String>();

    void  addEmployees(){
        mapOfEmployees.put(99,"Anna Nowak");
        mapOfEmployees.put(30,"Andrey Haravinkin");
        mapOfEmployees.put(28,"Iryna Matuzka");
    }
    void shouAllKeys(){
       // Set<Integer> allKeys = mapOfEmployees.keySet();
       // System.out.println(allKeys);
        System.out.println(mapOfEmployees.keySet());

    }
    void shouAllNames(){

        System.out.println(mapOfEmployees.values());

    }
    void getEmployee(int emploeeId){
        if (mapOfEmployees.containsKey(emploeeId)) {
            System.out.println(mapOfEmployees.get(emploeeId));
        }else {
            System.out.println("Brak pracownika o podanym identyfikatorze");
        }
    }
    void shouAllEmployees(){
      //  Set<Map.Entry<Integer, String>> set = mapOfEmployees.entrySet();
        for (Map.Entry<Integer, String>entry : mapOfEmployees.entrySet()) {
            System.out.printf("%s\t->\t%s\n", entry.getKey(),entry.getValue());
        }

    }
}
