package com.dan.book.springboot.domain.stations;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class NearStroll {
    private String near_stroll_path;

    private String street_name;

    private Double path_distance;

    private String path_start_point_address;

    private String path_end_point_street_address;

    private String path_end_point_address;

    private Double path_lat;

    private Double path_long;

    private String merge_data;

    public NearStroll(String near_stroll_path, String street_name, Double path_distance, String path_start_point_address, String path_end_point_street_address, String path_end_point_address, Double path_lat, Double path_long, String merge_data) {
        this.near_stroll_path = near_stroll_path;
        this.street_name = street_name;
        this.path_distance = path_distance;
        this.path_start_point_address = path_start_point_address;
        this.path_end_point_street_address = path_end_point_street_address;
        this.path_end_point_address = path_end_point_address;
        this.path_lat = path_lat;
        this.path_long = path_long;
        this.merge_data = merge_data;
    }
}
