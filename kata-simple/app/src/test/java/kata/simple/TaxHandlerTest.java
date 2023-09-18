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
        Car car = new Car.Builder().setId(1).setType(TypeCar.GASOLINE).setModel(2018).setPrice(10000.0).setPrecedence(Precedence.JAPAN).build();
        TaxHandler taxHandler = new TaxHandlerImpl();
        assertEquals(12000.0, taxHandler.getTotalPrice(car));
    }

    @Test
    public void getTotalPrice_whenCarIsElectricAndFromAmerica_totalPriceIs11000() {
        Car car = new Car.Builder().setId(1).setType(TypeCar.ELECTRIC).setModel(2018).setPrice(10000.0).setPrecedence(Precedence.AMERICA).build();
        TaxHandler taxHandler = new TaxHandlerImpl();
        assertEquals(5000.0, taxHandler.getTotalPrice(car));
    }

    @Test
    public void getTotalPrice_whenCarIsDieselAndFromEurope_totalPriceIs10500() {
        Car car = new Car.Builder().setId(1).setType(TypeCar.DIESEL).setModel(2018).setPrice(10000.0).setPrecedence(Precedence.EUROPE).build();
        TaxHandler taxHandler = new TaxHandlerImpl();
        assertEquals(7000.0, taxHandler.getTotalPrice(car));
    }

    @Test
    public void getTaxValue_whenCarIsGasoline_taxValueIs0_2() {
        TaxHandler taxHandler = new TaxHandlerImpl();
        assertEquals(0.2, taxHandler.getTaxValue());
    }
}
