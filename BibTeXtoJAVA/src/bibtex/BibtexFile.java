package bibtex;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BibtexFile implements IBibtexElement {

    private List<IBibtexElement> elements = new LinkedList<>();
    public Map<String, String> strings = new HashMap<>();

    public void accept(IBibtexElementVisitor visitor){
        for(IBibtexElement element : elements){
            element.accept(visitor);
        }
        visitor.visit(this);
    }

    public void put(IBibtexElement element){
        elements.add(element);
    }

    public void putString(String key, String value){
        strings.put(key, value);
    }
}
