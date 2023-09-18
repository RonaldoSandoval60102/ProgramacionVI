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

    public static class Builder {
        private int id;
        private TypeCar type;
        private int model;
        private double price;
        private Precedence precedence;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setType(TypeCar type) {
            this.type = type;
            return this;
        }

        public Builder setModel(int model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setPrecedence(Precedence precedence) {
            this.precedence = precedence;
            return this;
        }

        public Car build() {
            return new Car(id, type, model, price, precedence);
        }
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
