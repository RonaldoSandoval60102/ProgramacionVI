package com.kata.kata.repository;

import com.kata.kata.client.Car;

public interface TaxHandler {
    
    double getTotalPrice(Car car);

    double getTaxValue();
}
