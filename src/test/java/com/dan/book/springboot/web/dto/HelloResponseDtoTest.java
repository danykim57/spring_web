package com.dan.book.springboot.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;


public class HelloResponseDtoTest {
    @Test
    public void testLombok() {
        //init
        String name = "test";
        int amount = 1000;

        //condition
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //result
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);

    }

}