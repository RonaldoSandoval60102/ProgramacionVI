package patterVisitor.concreteVisitor;

import patterVisitor.concreteElement.Circle;
import patterVisitor.concreteElement.Rectangle;
import patterVisitor.visitor.Visitor;

public class AreaCalculator implements Visitor {

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.getRadius() * circle.getRadius();
        System.out.println("Area of circle with radius " + circle.getRadius() + " is " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getHeight() * rectangle.getWidth();
        System.out.println("Area of rectangle with height " + rectangle.getHeight() + " and width "
                + rectangle.getWidth() + " is " + area);
    }

}
