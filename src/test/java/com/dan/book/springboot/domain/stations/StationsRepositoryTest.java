package com.dan.book.springboot.domain.stations;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StationsRepositoryTest {

    @Autowired
    StationsRepository stationsRepository;

    @After
    public void cleanup() {stationsRepository.deleteAll();}

    @Test
    public void 따릉이정보볼러오기() throws Exception {
        //init

        //condition

        //result
    }

}