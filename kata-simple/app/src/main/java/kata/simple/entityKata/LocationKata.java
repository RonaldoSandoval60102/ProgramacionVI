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
    

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public StatusCar getStatus() {
        return status;
    }

    public static class  Builder {
        private StatusCar status;
        private String origin;
        private String destination;

        public Builder setStatus(StatusCar status) {
            this.status = status;
            return this;
        }

        public Builder setOrigin(String origin) {
            this.origin = origin;
            return this;
        }

        public Builder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public LocationKata build() {
            return new LocationKata(status, origin, destination);
        }
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
