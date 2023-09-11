package kata.simple.serviceKata;

import java.util.List;

import kata.simple.entityKata.LocationKata;
import kata.simple.entityKata.Stock;
import kata.simple.enumKata.Precedence;
import kata.simple.enumKata.TypeCar;
import kata.simple.interfaceKata.Subsidiary;

public class SubsidiaryImpl implements Subsidiary {

    private LocationKata location;
    private List<Stock> stocks;

    public SubsidiaryImpl(LocationKata location, List<Stock> stocks) {
        this.location = location;
        this.stocks = stocks;
    }

    @Override
    public List<Stock> getAllStocks() {
        return stocks;
    }

    @Override
    public List<Stock> getAllStocKByType(TypeCar type) {
        for (Stock stock : stocks) {
            if (stock.getCar().getType().equals(type)) {
                return stocks;
            }
        }
        return null;
    }

    @Override
    public List<Stock> getAllStockByPrecedence(Precedence precedence) {
        for (Stock stock : stocks) {
            if (stock.getCar().getPrecedence().equals(precedence)) {
                return stocks;
            }
        }
        return null;
    }

    @Override
    public double calculateTax(int cardId) {
        for (Stock stock : stocks) {
            if (stock.getCar().getId() == cardId) {
                return stock.getCar().getPrice() * 0.21;
            }
        }
        return 0;
    }

    @Override
    public LocationKata getLocation(int cardId) {
        for (Stock stock : stocks) {
            if (stock.getCar().getId() == cardId) {
                return location;
            }
        }
        return null;
    }
    
}
