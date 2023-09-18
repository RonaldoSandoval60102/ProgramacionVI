package patterVisitor.concreteElement;

import patterVisitor.element.Shape;
import patterVisitor.visitor.Visitor;

public class Rectangle implements Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }   
}
