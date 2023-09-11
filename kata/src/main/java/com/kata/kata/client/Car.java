package com.kata.kata.client;

import com.kata.kata.enums.Precedence;
import com.kata.kata.enums.Type;

import lombok.Data;


@Data
public class Car {
    private int id;
    private Type type;
    private int model;
    private double price;
    private Precedence precedence;

    private Car(int id, Type type, int model, double price, Precedence precedence) {
        this.id = id;
        this.type = type;
        this.model = model;
        this.price = price;
        this.precedence = precedence;
    }

    public static Car create(int id, Type type, int model, double price, Precedence precedence) {
        return new Car(id, type, model, price, precedence);
    }
}
