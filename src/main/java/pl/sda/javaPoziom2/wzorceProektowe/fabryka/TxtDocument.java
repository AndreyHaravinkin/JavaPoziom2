package pl.sda.javaPoziom2.wzorceProektowe.fabryka;

import static pl.sda.javaPoziom2.wzorceProektowe.fabryka.DocumentGenerator.*;
import static pl.sda.javaPoziom2.wzorceProektowe.fabryka.HtmlDocument.formatText;

public class TxtDocument extends Document {
    public TxtDocument(String myText, DocumentType type) {
        super(myText, type);
    }
}
