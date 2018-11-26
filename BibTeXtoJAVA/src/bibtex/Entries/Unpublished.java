package bibtex.Entries;

import bibtex.Fields;
import bibtex.IBibtexElementVisitor;

import java.util.Map;

public class Unpublished extends Entry {

    public static final Fields[] requiredFields = {Fields.AUTHOR, Fields.TITLE, Fields.NOTE};
    public static final Fields[] optionalFields = {Fields.MONTH, Fields.YEAR, Fields.KEY};

    public Unpublished(Map<Fields, String> records, String key){
        super(records, key);
    }

    @Override
    public void accept(IBibtexElementVisitor visitor){
        visitor.visit(this);
    }
}
