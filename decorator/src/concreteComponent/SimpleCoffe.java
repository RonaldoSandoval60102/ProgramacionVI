package concreteComponent;

import componet.Coffe;

public class SimpleCoffe implements Coffe{

    @Override
    public double getCost() {
        return 0.56;
    }

    @Override
    public String getDescription() {
        return "Simple coffe";
    }
    
}
