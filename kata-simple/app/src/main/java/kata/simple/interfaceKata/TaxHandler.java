package kata.simple.interfaceKata;

import kata.simple.entityKata.Car;

public interface TaxHandler {
    
    double getTotalPrice(Car car);

    double getTaxValue();
}
