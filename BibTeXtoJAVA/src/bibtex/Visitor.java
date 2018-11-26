package bibtex;

import bibtex.Entries.*;

public class Visitor implements IBibtexElementVisitor{
    public void visit(BibtexFile bibtexfile){

    }

    public void visit(Article article){
        System.out.println(article.records.get(Fields.AUTHOR));
    }

    public void visit(Book book){

    }

    public void visit(InProceedings inProceedings){

    }

    public void visit(Booklet booklet){

    }

    public void visit(InBook inbook){

    }

    public void visit(InCollection inCollection){

    }

    public void visit(Manual manual){

    }

    public void visit(MastersThesis mastersThesis){

    }

    public void visit(PhdThesis phdThesis){

    }

    public void visit(TechReport techReport){

    }

    public void visit(Misc misc){

    }

    public void visit(Unpublished unpublished){

    }
}
