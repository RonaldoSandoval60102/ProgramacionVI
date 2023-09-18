import componet.Coffe;
import concreteComponent.SimpleCoffe;

public class App {
    public static void main(String[] args) throws Exception {
        Coffe coffe = new SimpleCoffe();
        System.out.println("Cost: " + coffe.getCost() + "; Description: " + coffe.getDescription());
        Coffe coffeMilk = new concreteDecorator.CoffeMilk(coffe);
        System.out.println("Cost: " + coffeMilk.getCost() + "; Description: " + coffeMilk.getDescription());
    }
}
