package bibtex.Entries;

import bibtex.Fields;
import bibtex.IBibtexElementVisitor;

import java.util.Map;

public class TechReport extends Entry{

    public static final Fields[] requiredFields = {Fields.AUTHOR, Fields.TITLE,
            Fields.INSTITUTION, Fields.YEAR};
    public static final Fields[] optionalFields = {Fields.EDITOR, Fields.VOLUME,
            Fields.SERIES, Fields.ADRESS, Fields.MONTH, Fields.ORGANIZATION,
            Fields.PUBLISHER, Fields.NOTE, Fields.KEY};

    public TechReport(Map<Fields, String> records, String key){
        super(records, key);
    }

    @Override
    public void accept(IBibtexElementVisitor visitor){
        visitor.visit(this);
    }
}
