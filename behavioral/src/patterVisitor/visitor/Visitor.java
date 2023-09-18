package patterVisitor.visitor;

import patterVisitor.concreteElement.Circle;
import patterVisitor.concreteElement.Rectangle;

public interface Visitor {
    
    void visit(Circle circle);
    
    void visit(Rectangle rectangle);
}
