package pl.sda.javaPoziom2.wzorceProektowe.singleton;

import java.util.ArrayList;

public class DataBase {
    private static DataBase instance = null;

    private ArrayList<String> list;

    private DataBase() {
        list = new ArrayList<String>();
    }

    public static DataBase getInstans(){
        if (instance == null){
            instance = new DataBase();
        }
        return instance;
    }

    public void saveDate(String value){
        list.add(value);
    }
    public  void show(){
        System.out.println(list);
    }
}
