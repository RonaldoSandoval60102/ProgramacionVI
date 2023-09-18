package client;

import concretePrototype.Circle;
import prototype.Shape;

public class Draw {
    
    public static void main(String[] args) {
        Shape draw = new Circle("Worker Robot");
        draw.draw();
        try {
            Shape robotClone = draw.clone();
            robotClone.draw();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
