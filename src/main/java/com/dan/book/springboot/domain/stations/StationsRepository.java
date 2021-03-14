package com.dan.book.springboot.domain.stations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StationsRepository extends JpaRepository<Stations, Long> {
    @Query("SELECT s FROM Stations s ORDER BY s.id DESC")
    List<Stations> findAllDesc();
}
