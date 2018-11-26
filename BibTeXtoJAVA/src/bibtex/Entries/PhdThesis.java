package bibtex.Entries;

import bibtex.Fields;
import bibtex.IBibtexElementVisitor;

import java.util.Map;

public class PhdThesis extends Entry{

    public static final Fields[] requiredFields = {Fields.AUTHOR, Fields.TITLE, Fields.SCHOOL, Fields.YEAR};
    public static final Fields[] optionalFields = {Fields.TYPE, Fields.ADRESS, Fields.MONTH, Fields.NOTE, Fields.KEY};

    public PhdThesis(Map<Fields, String> records, String key){
        super(records, key);
    }

    @Override
    public void accept(IBibtexElementVisitor visitor){
        visitor.visit(this);
    }
}
