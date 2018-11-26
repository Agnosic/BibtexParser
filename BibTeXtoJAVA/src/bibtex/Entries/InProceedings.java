package bibtex.Entries;

import bibtex.Fields;
import bibtex.IBibtexElementVisitor;

import java.util.Map;

public class InProceedings extends Entry{

    public static final Fields[] requiredFields = {Fields.AUTHOR, Fields.TITLE,
            Fields.BOOKTITLE, Fields.YEAR};
    public static final Fields[] optionalFields = {Fields.EDITOR, Fields.VOLUME,  Fields.SERIES,
            Fields.PAGES, Fields.ADRESS, Fields.MONTH, Fields.ORGANIZATION, Fields.PUBLISHER,
            Fields.NOTE, Fields.KEY};

    public InProceedings(Map<Fields, String> records, String key){
        super(records, key);
    }

    @Override
    public void accept(IBibtexElementVisitor visitor){
        visitor.visit(this);
    }
}
