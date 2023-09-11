package kata.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import kata.simple.entityKata.Car;
import kata.simple.entityKata.LocationKata;
import kata.simple.entityKata.Stock;
import kata.simple.enumKata.Precedence;
import kata.simple.enumKata.StatusCar;
import kata.simple.enumKata.TypeCar;
import kata.simple.interfaceKata.Subsidiary;
import kata.simple.serviceKata.SubsidiaryImpl;

public class SubsidiaryTest {
    
    @Test
    public void  getAllStocks_whenStocksHaveNoProvenance_allStock() {
        LocationKata locationKat = LocationKata.create(StatusCar.SENT, "A", "B");
        List<Stock> stocks = List.of(Stock.create(Car.create(1, TypeCar.GASOLINE, 2018, 10000.0, Precedence.JAPAN), 10));
        Subsidiary subsidiary = new SubsidiaryImpl(locationKat, stocks);
        assertEquals(1, subsidiary.getAllStocks().size());
    }

    @Test
    public void getAllStocKByType_whenTypeIsGasoline_stocksIsGasoline() {
        LocationKata locationKat = LocationKata.create(StatusCar.SENT, "A", "B");
        List<Stock> stocks = List.of(Stock.create(Car.create(1, TypeCar.GASOLINE, 2018, 10000.0, Precedence.JAPAN), 10));
        Subsidiary subsidiary = new SubsidiaryImpl(locationKat, stocks);
        assertEquals(1, subsidiary.getAllStocKByType(TypeCar.GASOLINE).size());
    }


    @Test
    public void getAllStockByPrecedence_whenPrecedenceIsJapan_stocksIsJapan() {
        LocationKata locationKat = LocationKata.create(StatusCar.SENT, "A", "B");
        List<Stock> stocks = List.of(Stock.create(Car.create(1, TypeCar.GASOLINE, 2018, 10000.0, Precedence.JAPAN), 10));
        Subsidiary subsidiary = new SubsidiaryImpl(locationKat, stocks);
        assertEquals(1, subsidiary.getAllStockByPrecedence(Precedence.JAPAN).size());
    }

    @Test
    public void calculateTax_whenCarIdIs1_taxIs2100() {
        LocationKata locationKat = LocationKata.create(StatusCar.SENT, "A", "B");
        List<Stock> stocks = List.of(Stock.create(Car.create(1, TypeCar.GASOLINE, 2018, 10000.0, Precedence.JAPAN), 10));
        Subsidiary subsidiary = new SubsidiaryImpl(locationKat, stocks);
        assertEquals(2100, subsidiary.calculateTax(1));
    }

    @Test
    public void getLocation_whenCarIdIs1_locationIsAB() {
        LocationKata locationKat = LocationKata.create(StatusCar.SENT, "A", "B");
        List<Stock> stocks = List.of(Stock.create(Car.create(1, TypeCar.GASOLINE, 2018, 10000.0, Precedence.JAPAN), 10));
        Subsidiary subsidiary = new SubsidiaryImpl(locationKat, stocks);
        assertEquals("A", subsidiary.getLocation(1).getOrigin());
        assertEquals("B", subsidiary.getLocation(1).getDestination());
    }    
}
