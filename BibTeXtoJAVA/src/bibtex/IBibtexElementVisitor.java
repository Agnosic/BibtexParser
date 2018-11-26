package bibtex;


import bibtex.Entries.*;

public interface IBibtexElementVisitor {
    void visit(BibtexFile bibtexfile);

    void visit(Article article);

    void visit(Book book);

    void visit(InProceedings inProceedings);

    void visit(Booklet booklet);

    void visit(InBook inbook);

    void visit(InCollection inCollection);

    void visit(Manual manual);

    void visit(MastersThesis mastersThesis);

    void visit(PhdThesis phdThesis);

    void visit(TechReport techReport);

    void visit(Misc misc);

    void visit(Unpublished unpublished);
}
