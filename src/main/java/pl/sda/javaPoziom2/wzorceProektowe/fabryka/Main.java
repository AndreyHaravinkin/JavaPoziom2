package pl.sda.javaPoziom2.wzorceProektowe.fabryka;

import pl.sda.javaPoziom2.wzorceProektowe.fabryka.DocumentGenerator.DocumentType;

import static pl.sda.javaPoziom2.wzorceProektowe.fabryka.DocumentGenerator.DocumentType.*;

public class Main {
    public static void main(String[] args) {
        factory();
    }

    private static void factory() {
        DocumentGenerator generator = new DocumentGenerator();

        String myText = "Najwieksza w Polsce \r\nakademia programowania";

        Document txt = generator.creatDocument(myText,TXT);
        txt.saveFile();

        Document html = generator.creatDocument(myText,HTML);
        html.saveFile();
        System.out.println(html.getMyText());


    }
}
