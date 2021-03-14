package com.dan.book.springboot.domain.stations;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
public class BikeStation {

    @Column(length = 10, nullable = false)
    private Long station_id;

    @Column(nullable = false)
    private String station_name;

    private String district;

    private String address;

    private Double latitude;

    private Double longitude;

    @Column(length = 10, nullable = false)
    private Long stands;

    private String running_method;

    public BikeStation(Long station_id, String station_name, String district, String address, Double latitude, Double longitude, Long stands, String running_method) {
        this.station_id = station_id;
        this.station_name = station_name;
        this.district = district;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.stands = stands;
        this.running_method = running_method;
    }
}
