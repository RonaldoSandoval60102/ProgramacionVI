package concreteDecorator;

import componet.Coffe;
import decorator.CoffeDecorator;

public class CoffeMilk extends CoffeDecorator{

    public CoffeMilk(Coffe CoffeDecorator) {
        super(CoffeDecorator);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
