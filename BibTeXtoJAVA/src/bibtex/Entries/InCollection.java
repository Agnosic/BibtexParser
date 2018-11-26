package bibtex.Entries;

import bibtex.Fields;
import bibtex.IBibtexElementVisitor;

import java.util.Map;

public class InCollection extends Entry{

    public static final Fields[] requiredFields = {Fields.AUTHOR, Fields.TITLE, Fields.BOOKTITLE,
            Fields.PUBLISHER, Fields.YEAR};
    public static final Fields[] optionalFields = {Fields.EDITOR, Fields.VOLUME, Fields.SERIES,
            Fields.TYPE, Fields.CHAPTER, Fields.PAGES, Fields.ADRESS, Fields.EDITOR,
            Fields.MONTH, Fields.NOTE};

    public InCollection(Map<Fields, String> records, String key){
        super(records, key);
    }

    @Override
    public void accept(IBibtexElementVisitor visitor){
        visitor.visit(this);
    }
}
