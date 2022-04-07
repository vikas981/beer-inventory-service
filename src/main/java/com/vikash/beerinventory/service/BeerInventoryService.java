package com.vikash.beerinventory.service;


import com.vikash.beerinventory.repository.BeerInventoryRepository;
import com.vikash.beerinventory.web.model.BeerInventoryDto;

import java.util.List;
import java.util.UUID;

public interface BeerInventoryService {

   List<BeerInventoryDto> findAllBeer(UUID beerId);
}
