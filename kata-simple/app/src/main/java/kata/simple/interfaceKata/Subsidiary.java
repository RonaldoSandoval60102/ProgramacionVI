package kata.simple.interfaceKata;

import java.util.List;

import kata.simple.entityKata.LocationKata;
import kata.simple.entityKata.Stock;
import kata.simple.enumKata.Precedence;
import kata.simple.enumKata.TypeCar;

public interface Subsidiary {
    
    List<Stock>getAllStocks();

    List<Stock>getAllStocKByType(TypeCar type);

    List<Stock>getAllStockByPrecedence(Precedence precedence);

    double calculateTax(int cardId);

    LocationKata getLocation(int cardId);
    
}
