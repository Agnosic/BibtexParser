package bibtex.Entries;

import bibtex.Fields;
import bibtex.IBibtexElementVisitor;

import java.util.Map;

public class Booklet extends Entry{

    public static final Fields[] requiredFields = {Fields.TITLE};
    public static final Fields[] optionalFields = {Fields.AUTHOR, Fields.HOWPUBLISHED,
        Fields.ADRESS, Fields.MONTH, Fields.YEAR, Fields.NOTE, Fields.KEY};

    public Booklet(Map<Fields, String> records, String key){
        super(records, key);
    }

    @Override
    public void accept(IBibtexElementVisitor visitor){
        visitor.visit(this);
    }
}
