package bibtex.Entries;

import bibtex.Fields;
import bibtex.IBibtexElementVisitor;

import java.util.Map;

public class Article extends Entry {

    public static final Fields[] requiredFields = {Fields.TITLE, Fields.TITLE,
            Fields.JOURNAL, Fields.YEAR};
    public static final Fields[] optionalFields = {Fields.VOLUME, Fields.NUMBER,
            Fields.PAGES, Fields.MONTH, Fields.NOTE, Fields.KEY};

    public Article(Map<Fields, String> records, String key){
        super(records, key);
    }

    @Override
    public void accept(IBibtexElementVisitor visitor){
        visitor.visit(this);
    }


}
