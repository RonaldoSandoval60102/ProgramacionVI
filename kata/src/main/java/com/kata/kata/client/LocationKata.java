package com.kata.kata.client;

import org.apache.tomcat.jni.Status;

import lombok.Data;

@Data
public class LocationKata {
    private Status status;
    private String origin;
    private String destination;

    private LocationKata (Status status, String origin, String destination) {
        this.status = status;
        this.origin = origin;
        this.destination = destination;
    }

    public static LocationKata create(Status status, String origin, String destination){
        return new LocationKata(status, origin, destination);
    }
}
