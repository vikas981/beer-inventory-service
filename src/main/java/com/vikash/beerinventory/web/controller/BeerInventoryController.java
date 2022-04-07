package com.vikash.beerinventory.web.controller;

import com.vikash.beerinventory.service.BeerInventoryService;
import com.vikash.beerinventory.web.model.BeerInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Slf4j
public class BeerInventoryController {

    private final BeerInventoryService beerInventoryService;

    @GetMapping("/api/v1/beer/{beerId}/inventory")
    public ResponseEntity<List<BeerInventoryDto>> listBeersById(@PathVariable("beerId") UUID beerId){
      return new ResponseEntity<>(beerInventoryService.findAllBeer(beerId), HttpStatus.OK);
    }
}
