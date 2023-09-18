package patterVisitor.element;

import patterVisitor.visitor.Visitor;

public interface Shape {
    void accept(Visitor visitor);
}
