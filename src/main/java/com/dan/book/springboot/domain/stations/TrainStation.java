package com.dan.book.springboot.domain.stations;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class TrainStation {

    private String near_station;

    private Double near_station_street_distance;

    private Double near_station_lat;

    private Double near_station_long;

    public TrainStation(String near_station, Double near_station_street_distance, Double near_station_lat, Double near_station_long) {
        this.near_station = near_station;
        this.near_station_street_distance = near_station_street_distance;
        this.near_station_lat = near_station_lat;
        this.near_station_long = near_station_long;
    }
}
