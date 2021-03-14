package com.dan.book.springboot.domain.stations;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Stations {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private BikeStation bike_station;

    @Embedded
    private TrainStation near_train_station;

    @Embedded
    private NearPark near_park;

    @Embedded
    private NearTrainStationDistance train_station_around;

    @Embedded
    private NearBusinessStrict businessStrict;

    @Embedded
    private NearStroll stroll_path;

    @Embedded
    private ParkInfo park;

    @Builder
    public Stations(Long id, BikeStation bike_station, TrainStation near_train_station, NearPark near_park, NearTrainStationDistance train_station_around, NearBusinessStrict businessStrict, NearStroll stroll_path, ParkInfo park) {
        this.id = id;
        this.bike_station = bike_station;
        this.near_train_station = near_train_station;
        this.near_park = near_park;
        this.train_station_around = train_station_around;
        this.businessStrict = businessStrict;
        this.stroll_path = stroll_path;
        this.park = park;
    }
}
