package com.dan.book.springboot.domain.stations;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class NearBusinessStrict {
    private Double gangnam_business_district_distance;

    private Double gwanghwa_business_district_distance;

    private Double yeoujee_business_district_distance;

    private Double magouk_business_district_distance;

    private Double gasan_business_district_distance;

    public NearBusinessStrict(Double gangnam_business_district_distance, Double gwanghwa_business_district_distance, Double yeoujee_business_district_distance, Double magouk_business_district_distance, Double gasan_business_district_distance) {
        this.gangnam_business_district_distance = gangnam_business_district_distance;
        this.gwanghwa_business_district_distance = gwanghwa_business_district_distance;
        this.yeoujee_business_district_distance = yeoujee_business_district_distance;
        this.magouk_business_district_distance = magouk_business_district_distance;
        this.gasan_business_district_distance = gasan_business_district_distance;
    }
}
