package kata.simple.entityKata;

public class Stock {
    
    private Car car;
    private int quantity;

    private Stock(Car car, int quantity) {
        this.car = car;
        this.quantity = quantity;
    }

    public Car getCar() {
        return car;
    }

    public int getQuantity() {
        return quantity;
    }

    public static class Builder {
        private Car car;
        private int quantity;

        public Builder setCar(Car car) {
            this.car = car;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Stock build() {
            return new Stock(car, quantity);
        }
    }

    @Override
    public String toString() {
        return "Stock{" +
                "car=" + car +
                ", quantity=" + quantity +
                '}';
    }
}
