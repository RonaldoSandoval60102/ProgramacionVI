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
        cars.add(new Car.Builder().setId(1).setType(TypeCar.GASOLINE).setModel(2018).setPrice(10000.0).setPrecedence(Precedence.JAPAN).build());
        cars.add(new Car.Builder().setId(2).setType(TypeCar.ELECTRIC).setModel(2018).setPrice(10000.0).setPrecedence(Precedence.JAPAN).build());
        cars.add(new Car.Builder().setId(3).setType(TypeCar.DIESEL).setModel(2018).setPrice(10000.0).setPrecedence(Precedence.JAPAN).build());
        LocationKata locationKat = new LocationKata.Builder().setStatus(StatusCar.SENT).setOrigin("A").setDestination("B").build();
        ShipmentDepartment shipmentDepartment = new ShipmentDepartmentImpl(locationKat, cars);
        assertEquals("A", shipmentDepartment.getLocation().getOrigin());
        assertEquals("B", shipmentDepartment.getLocation().getDestination());
    }

    @Test
    public void getCars_whenCarsIsJapan_carsIsJapan() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car.Builder().setId(1).setType(TypeCar.GASOLINE).setModel(2018).setPrice(10000.0).setPrecedence(Precedence.JAPAN).build());
        cars.add(new Car.Builder().setId(2).setType(TypeCar.ELECTRIC).setModel(2018).setPrice(10000.0).setPrecedence(Precedence.JAPAN).build());
        cars.add(new Car.Builder().setId(3).setType(TypeCar.DIESEL).setModel(2018).setPrice(10000.0).setPrecedence(Precedence.JAPAN).build());
        LocationKata locationKat = new LocationKata.Builder().setStatus(StatusCar.SENT).setOrigin("A").setDestination("B").build();
        ShipmentDepartment shipmentDepartment = new ShipmentDepartmentImpl(locationKat, cars);
        assertEquals(3, shipmentDepartment.getCars().size());
    }
}
