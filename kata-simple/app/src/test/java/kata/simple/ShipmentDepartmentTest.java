package kata.simple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import kata.simple.entityKata.Car;
import kata.simple.entityKata.LocationKata;
import kata.simple.enumKata.Precedence;
import kata.simple.enumKata.StatusCar;
import kata.simple.enumKata.TypeCar;
import kata.simple.interfaceKata.ShipmentDepartment;
import kata.simple.serviceKata.ShipmentDepartmentImpl;

public class ShipmentDepartmentTest {

    @Test
    public void getLocation_whenLocationIsJapan_locationIsJapan() {
        List<Car> cars = new ArrayList<>();
        cars.add(Car.create(1, TypeCar.GASOLINE, 2018, 10000.0, Precedence.JAPAN));
        cars.add(Car.create(2, TypeCar.ELECTRIC, 2018, 10000.0, Precedence.JAPAN));
        cars.add(Car.create(3, TypeCar.DIESEL, 2018, 10000.0, Precedence.JAPAN));
        LocationKata locationKat = LocationKata.create(StatusCar.SENT, "A", "B");
        ShipmentDepartment shipmentDepartment = new ShipmentDepartmentImpl(locationKat, cars);
        assertEquals("A", shipmentDepartment.getLocation().getOrigin());
        assertEquals("B", shipmentDepartment.getLocation().getDestination());
    }

    @Test
    public void getCars_whenCarsIsJapan_carsIsJapan() {
        List<Car> cars = new ArrayList<>();
        cars.add(Car.create(1, TypeCar.GASOLINE, 2018, 10000.0, Precedence.JAPAN));
        cars.add(Car.create(2, TypeCar.ELECTRIC, 2018, 10000.0, Precedence.JAPAN));
        cars.add(Car.create(3, TypeCar.DIESEL, 2018, 10000.0, Precedence.JAPAN));
        LocationKata locationKat = LocationKata.create(StatusCar.SENT, "A", "B");
        ShipmentDepartment shipmentDepartment = new ShipmentDepartmentImpl(locationKat, cars);
        assertEquals(3, shipmentDepartment.getCars().size());
    }
}
