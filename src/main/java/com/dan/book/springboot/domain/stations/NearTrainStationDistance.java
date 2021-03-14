package com.dan.book.springboot.domain.stations;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class NearTrainStationDistance {

    private Integer num_of_stations_within_500;

    private Integer num_of_stations_within_1000;

    private Integer num_of_stations_within_2000;

    public NearTrainStationDistance(Integer num_of_stations_within_500, Integer num_of_stations_within_1000, Integer num_of_stations_within_2000) {
        this.num_of_stations_within_500 = num_of_stations_within_500;
        this.num_of_stations_within_1000 = num_of_stations_within_1000;
        this.num_of_stations_within_2000 = num_of_stations_within_2000;
    }
}
