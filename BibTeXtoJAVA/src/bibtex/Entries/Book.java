package bibtex.Entries;

import bibtex.Fields;
import bibtex.IBibtexElementVisitor;

import java.util.Map;

public class Book extends Entry {

    public static final Fields[] requiredFields = {Fields.AUTHOR, Fields.TITLE,
            Fields.PUBLISHER, Fields.YEAR};
    public static final Fields[] optionalFields = {Fields.VOLUME, Fields.SERIES,
            Fields.ADRESS, Fields.EDITION, Fields.MONTH, Fields.NOTE, Fields.KEY};

    public Book(Map<Fields, String> records, String key){
        super(records, key);
    }

    @Override
    public void accept(IBibtexElementVisitor visitor){
        visitor.visit(this);
    }
}
