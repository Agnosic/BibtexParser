package bibtex.Entries;

import bibtex.Fields;
import bibtex.IBibtexElementVisitor;

import java.util.Map;

public class Manual extends Entry{

    public static final Fields[] requiredFields = {Fields.TITLE};
    public static final Fields[] optionalFields = {Fields.AUTHOR, Fields.ORGANIZATION,
            Fields.ADRESS, Fields.EDITION, Fields.MONTH, Fields.YEAR, Fields.NOTE, Fields.KEY};

    public Manual(Map<Fields, String> records, String key){
        super(records, key);
    }

    @Override
    public void accept(IBibtexElementVisitor visitor){
        visitor.visit(this);
    }
}
