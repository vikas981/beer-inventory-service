package com.vikash.beerinventory.service;

import com.vikash.beerinventory.repository.BeerInventoryRepository;
import com.vikash.beerinventory.web.mappers.BeerInventoryMapper;
import com.vikash.beerinventory.web.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class BeerInventoryServiceImpl implements BeerInventoryService {

    private final BeerInventoryRepository beerInventoryRepository;
    private final BeerInventoryMapper beerInventoryMapper;



    @Override
    public List<BeerInventoryDto> findAllBeer(UUID beerId) {
        return beerInventoryRepository.findAllByBeerId(beerId)
                .stream().map(beerInventoryMapper::beerInventoryToBeerInventoryDto)
                .collect(Collectors.toList());
    }
}
