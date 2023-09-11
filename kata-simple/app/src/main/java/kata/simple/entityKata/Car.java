package kata.simple.entityKata;

import kata.simple.enumKata.Precedence;
import kata.simple.enumKata.TypeCar;

public class Car {
    
    private int id;
    private TypeCar type;
    private int model;
    private double price;
    private Precedence precedence;

    private Car(int id, TypeCar type, int model, double price, Precedence precedence) {
        this.id = id;
        this.type = type;
        this.model = model;
        this.price = price;
        this.precedence = precedence;
    }

    public static Car create(int id, TypeCar type, int model, double price, Precedence precedence) {
        return new Car(id, type, model, price, precedence);
    }

    public int getId() {
        return id;
    }

    public int getModel() {
        return model;
    }

    public Precedence getPrecedence() {
        return precedence;
    }


    public double getPrice() {
        return price;
    }

    public TypeCar getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", type=" + type +
                ", model=" + model +
                ", price=" + price +
                ", precedence=" + precedence +
                '}';
    }
}
