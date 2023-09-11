package kata.simple.serviceKata;

import kata.simple.entityKata.Car;
import kata.simple.interfaceKata.TaxHandler;

public class TaxHandlerImpl implements TaxHandler {

    private static final double TAX_VALUE = 0.2;

    @Override
    public double getTotalPrice(Car car) {
        switch (car.getType()) {
            case ELECTRIC:
                return car.getPrice() * (1 + TAX_VALUE - 0.70);
            case DIESEL:
                return car.getPrice() * (1 + TAX_VALUE - 0.50);
            case GASOLINE:
                return car.getPrice() * (1 + TAX_VALUE);
            default:
                return car.getPrice();
        }
    }

    @Override
    public double getTaxValue() {
        return TAX_VALUE;
    }
    
}
