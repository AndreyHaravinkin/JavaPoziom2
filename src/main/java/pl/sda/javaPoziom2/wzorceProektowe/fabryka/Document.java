package pl.sda.javaPoziom2.wzorceProektowe.fabryka;

import pl.sda.javaPoziom2.wzorceProektowe.fabryka.DocumentGenerator.DocumentType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Document {
    private DocumentType type;
    private String myText;

    public Document(String s, DocumentType type) {
    }


    public String getMyText() {
        return myText;
    }

    public void setMyText(String myText) {
        this.myText = myText;
    }

    public void saveFile(){
        String path = "C:\\Users\\PC\\Desktop" ;
        String fileName = "My";
        String  outputPath = String.format("%s/%s.%s",path, fileName, type.getExtension());

        System.out.println("Plik zostanie zapisany w: "+ outputPath);
        System.out.println("Text do zapisania: "+ myText);

        try {
            File file = new File(outputPath);
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(myText);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
