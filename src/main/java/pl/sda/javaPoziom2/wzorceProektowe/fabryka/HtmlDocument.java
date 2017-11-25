package pl.sda.javaPoziom2.wzorceProektowe.fabryka;

import pl.sda.javaPoziom2.wzorceProektowe.fabryka.DocumentGenerator.DocumentType;

public class HtmlDocument extends Document {
    public HtmlDocument(String myText, DocumentType type) {
        super(formatText(myText),type);
    }


    static String formatText(String myText){
        return String.format("<h1>%s</h1>", myText.replaceAll("\r\n", "<br>"));

    }
}
