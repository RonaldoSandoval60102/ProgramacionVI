package kata.simple.serviceKata;

import java.util.List;

import kata.simple.entityKata.Car;
import kata.simple.entityKata.LocationKata;
import kata.simple.interfaceKata.ShipmentDepartment;

public class ShipmentDepartmentImpl implements ShipmentDepartment{

    private LocationKata location;
    private List<Car> cars;

    public ShipmentDepartmentImpl(LocationKata location, List<Car> cars) {
        this.location = location;
        this.cars = cars;
    }

    @Override
    public LocationKata getLocation() {
        return location;
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
    
}
