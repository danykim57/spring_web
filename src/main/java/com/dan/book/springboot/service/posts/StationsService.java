package com.dan.book.springboot.service.posts;

import com.dan.book.springboot.domain.stations.StationsRepository;
import com.dan.book.springboot.web.dto.StationsListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class StationsService {

    private final StationsRepository stationsRepository;

    @Transactional(readOnly = true)
    public List<StationsListResponseDto> findAllDesc() {
        return stationsRepository.findAllDesc().stream()
                .map(entity -> new StationsListResponseDto(entity))
                .collect(Collectors.toList());
    }
}
