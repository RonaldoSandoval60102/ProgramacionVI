package com.kata.kata.repository;

import java.util.List;

import com.kata.kata.client.LocationKata;
import com.kata.kata.client.Stock;
import com.kata.kata.enums.Precedence;
import com.kata.kata.enums.Type;

public interface Subsidiary {
    
    List<Stock>getAllStocks();

    List<Stock>getAllStocKByType(Type type);

    List<Stock>getAllStockByPrecedence(Precedence precedence);

    double calculateTax(int cardId);

    LocationKata getLocation(int cardId);
    
}
