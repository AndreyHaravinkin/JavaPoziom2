package pl.sda.javaPoziom2.lista;

public class Regex {
    static void match(String word, String pattern){
        System.out.println("Slowo: "+ word);
        System.out.println("Wzorzec: "+ pattern);

        if (word.matches(pattern)){
            System.out.println("Czy pasuje: TAK");
        }else {
            System.out.println("Czy pasuje: NIE");
        }
        System.out.println();
    }
}
