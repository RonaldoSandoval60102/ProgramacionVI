package kata.simple.entityKata;

import kata.simple.enumKata.StatusCar;

public class LocationKata {
    
    private StatusCar status;
    private String origin;
    private String destination;

    private LocationKata (StatusCar status, String origin, String destination) {
        this.status = status;
        this.origin = origin;
        this.destination = destination;
    }
    
    public static LocationKata create(StatusCar status, String origin, String destination) {
        return new LocationKata(status, origin, destination);
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public StatusCar getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "LocationKata{" +
                "status=" + status +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
