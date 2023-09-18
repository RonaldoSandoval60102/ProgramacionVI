package patterVisitor;
import patterVisitor.concreteElement.Circle;
import patterVisitor.concreteElement.Rectangle;
import patterVisitor.concreteVisitor.AreaCalculator;
import patterVisitor.element.Shape;

public class App {
    public static void main(String[] args) throws Exception {
        Shape shapes = new Circle(5);
        Shape shapes2 = new Rectangle(5, 10);
        AreaCalculator areaCalculator = new AreaCalculator();
        shapes.accept(areaCalculator);
        shapes2.accept(areaCalculator);
    }
}
