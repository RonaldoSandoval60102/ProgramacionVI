package patterVisitor.concreteElement ;

import patterVisitor.element.Shape;
import patterVisitor.visitor.Visitor;

public class Circle implements Shape {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
