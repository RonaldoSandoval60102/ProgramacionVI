package kata.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import kata.simple.entityKata.Car;
import kata.simple.enumKata.Precedence;
import kata.simple.enumKata.TypeCar;
import kata.simple.interfaceKata.TaxHandler;
import kata.simple.serviceKata.TaxHandlerImpl;

public class TaxHandlerTest {
    
    @Test 
    public void getTotalPrice_whenCarIsGasolineAndFromJapan_totalPriceIs12000() {
        Car car = Car.create(1, TypeCar.GASOLINE, 2018, 10000.0, Precedence.JAPAN);
        TaxHandler taxHandler = new TaxHandlerImpl();
        assertEquals(12000.0, taxHandler.getTotalPrice(car));
    }

    @Test
    public void getTotalPrice_whenCarIsElectricAndFromAmerica_totalPriceIs11000() {
        Car car = Car.create(1, TypeCar.ELECTRIC, 2018, 10000.0, Precedence.AMERICA);
        TaxHandler taxHandler = new TaxHandlerImpl();
        assertEquals(5000.0, taxHandler.getTotalPrice(car));
    }

    @Test
    public void getTotalPrice_whenCarIsDieselAndFromEurope_totalPriceIs10500() {
        Car car = Car.create(1, TypeCar.DIESEL, 2018, 10000.0, Precedence.EUROPE);
        TaxHandler taxHandler = new TaxHandlerImpl();
        assertEquals(7000.0, taxHandler.getTotalPrice(car));
    }

    @Test
    public void getTaxValue_whenCarIsGasoline_taxValueIs0_2() {
        TaxHandler taxHandler = new TaxHandlerImpl();
        assertEquals(0.2, taxHandler.getTaxValue());
    }
}
