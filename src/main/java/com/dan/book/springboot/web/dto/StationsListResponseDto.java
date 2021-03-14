package com.dan.book.springboot.web.dto;

import com.dan.book.springboot.domain.stations.*;
import lombok.Getter;

@Getter
public class StationsListResponseDto{
    private Long id;
    private BikeStation bike_station;
    private TrainStation near_train_station;
    private NearPark near_park;
    private NearTrainStationDistance train_station_around;
    private NearBusinessStrict businessStrict;
    private NearStroll stroll_path;
    private ParkInfo park;

    public StationsListResponseDto(Stations entity) {
        this.id = entity.getId();
        this.bike_station = entity.getBike_station();
        this.near_train_station = entity.getNear_train_station();
        this.near_park = entity.getNear_park();
        this.train_station_around = entity.getTrain_station_around();
        this.businessStrict = entity.getBusinessStrict();
        this.stroll_path = entity.getStroll_path();
        this.park = entity.getPark();
    }
}
