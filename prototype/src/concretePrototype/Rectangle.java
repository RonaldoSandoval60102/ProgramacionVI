package concretePrototype;

import prototype.Shape;

public class Rectangle  extends Shape{
    
    public Rectangle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle named " + name + ".");
    }
}
