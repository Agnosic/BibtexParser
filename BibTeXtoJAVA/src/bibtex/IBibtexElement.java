package bibtex;

public interface IBibtexElement {

    void accept(IBibtexElementVisitor visitor);
}
