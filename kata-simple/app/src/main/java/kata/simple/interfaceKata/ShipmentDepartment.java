package kata.simple.interfaceKata;

import java.util.List;

import kata.simple.entityKata.Car;
import kata.simple.entityKata.LocationKata;

public interface ShipmentDepartment {
    
    LocationKata getLocation();

    List<Car> getCars();
}
