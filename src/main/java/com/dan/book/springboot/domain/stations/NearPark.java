package com.dan.book.springboot.domain.stations;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class NearPark {
    private String near_park;

    private Double near_park_distance;

    private Double near_park_lat;

    private Double near_park_long;

    private String near_park_address;

    public NearPark(String near_park, Double near_park_distance, Double near_park_lat, Double near_park_long, String near_park_address) {
        this.near_park = near_park;
        this.near_park_distance = near_park_distance;
        this.near_park_lat = near_park_lat;
        this.near_park_long = near_park_long;
        this.near_park_address = near_park_address;
    }
}
