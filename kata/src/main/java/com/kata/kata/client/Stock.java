package com.kata.kata.client;

import lombok.Data;

@Data
public class Stock {
    private Car car;
    private int quantity;

    private Stock(Car car, int quantity) {
        this.car = car;
        this.quantity = quantity;
    }

    public static Stock create(Car car, int quantity) {
        return new Stock(car, quantity);
    }
}
