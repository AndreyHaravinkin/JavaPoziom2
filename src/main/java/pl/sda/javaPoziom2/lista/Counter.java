package pl.sda.javaPoziom2.lista;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Counter {

    Map<String, Integer> allWords = new TreeMap<String, Integer>();

    void countWords() {

        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\PC\\Desktop\\Tadeusz.txt"));

            while (scanner.hasNext()){
                String word = scanner.next();
                if (allWords.containsKey(word)){
                    allWords.put(word, allWords.get(word) + 1);
                }else {
                    allWords.put(word, 1);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, Integer> word : allWords.entrySet()){
            System.out.printf("%s->%s\n", word.getKey(), word.getValue());
        }

    }

}
