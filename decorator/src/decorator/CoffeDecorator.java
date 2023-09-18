package decorator;

import componet.Coffe;

public class CoffeDecorator implements Coffe{
    protected Coffe Coffe;

    public CoffeDecorator(Coffe Coffe) {
        this.Coffe = Coffe;
    }

    @Override
    public double getCost() {
        return Coffe.getCost();
    }

    @Override
    public String getDescription() {
        return Coffe.getDescription();
    }


}
