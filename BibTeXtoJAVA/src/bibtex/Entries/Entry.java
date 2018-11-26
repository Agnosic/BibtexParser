package bibtex.Entries;

import bibtex.Fields;
import bibtex.IBibtexElement;

import java.util.Map;

public abstract class Entry implements IBibtexElement {
    public static Fields[] requiredFields;
    public static Fields[] optionalFields;

    final public Map<Fields, String> records;
    final public String key;

    public Entry(Map<Fields, String> records, String key){
        this.records = records;
        this.key = key;
    }
}
