package com.dan.book.springboot.domain.stations;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class ParkInfo {

    private String park_name;

    private String park_kind;

    private double park_area;

    public ParkInfo(String park_name, String park_kind, double park_area) {
        this.park_name = park_name;
        this.park_kind = park_kind;
        this.park_area = park_area;
    }
}
