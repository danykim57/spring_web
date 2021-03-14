package com.dan.book.springboot.web;

import com.dan.book.springboot.service.posts.StationsService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StationsApiController {

    private final StationsService stationsService;

    @GetMapping("/stations")
    public String index(Model model) {
        model.addAttribute("stations", stationsService.findAllDesc());
        return "test";
    }
}
