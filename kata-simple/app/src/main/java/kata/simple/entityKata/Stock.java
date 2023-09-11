package kata.simple.entityKata;

public class Stock {
    
    private Car car;
    private int quantity;

    private Stock(Car car, int quantity) {
        this.car = car;
        this.quantity = quantity;
    }

    public static Stock create(Car car, int quantity) {
        return new Stock(car, quantity);
    }

    public Car getCar() {
        return car;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "car=" + car +
                ", quantity=" + quantity +
                '}';
    }
}
