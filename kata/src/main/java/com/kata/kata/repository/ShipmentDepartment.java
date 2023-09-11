package com.kata.kata.repository;

import java.util.List;

import com.kata.kata.client.Car;
import com.kata.kata.client.LocationKata;

public interface ShipmentDepartment {

    LocationKata getLocation();

    List<Car> getCars();
}
