package syntaxtree;
import symbol.Symbol;
import typechecking.TypeCheckVisitor;
import visitor.Visitor;
import visitor.TypeVisitor;

public abstract class Exp {
  public abstract void accept(Visitor v);
  public abstract Type accept(TypeVisitor v);
  public abstract Symbol accept(TypeCheckVisitor v);
  public abstract translate.Exp accept( translate.VisitorIR v);

}
