package concretePrototype;

import prototype.Shape;

public class Circle  extends Shape{


    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle named " + name + ".");
    }    
}
