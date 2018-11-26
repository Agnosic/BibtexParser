package bibtex;

import bibtex.Entries.Article;
import bibtex.Parser.BibtexParser;


public class Main {

    public static void main(String[] args) {
        String path = "C:\\Users\\Jasiek\\Desktop\\xamp1.bib";

        BibtexFile bibtexFile = BibtexParser.parse(path);

        Visitor visitor = new Visitor();

        bibtexFile.accept(visitor);

    }
}
