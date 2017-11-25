package pl.sda.javaPoziom2.wzorceProektowe.fabryka;


import static pl.sda.javaPoziom2.wzorceProektowe.fabryka.DocumentGenerator.DocumentType.*;

public class DocumentGenerator {


    public Document creatDocument(String myText, DocumentType type) {

        Document document ;

        switch (type){
            case TXT:
                document = new TxtDocument(myText,TXT);
                break;

            case HTML:
                document = new HtmlDocument(myText,HTML);
                break;

            default:
                document = null;
                break;
        }
        return document;
    }

    public enum DocumentType{
        TXT(".txt"), HTML(".html");

        private String extension;

        DocumentType(String e) {
            extension = e;
        }

        public String getExtension() {
            return extension;
        }
    }
}
