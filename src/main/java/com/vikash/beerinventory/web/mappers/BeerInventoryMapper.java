package com.vikash.beerinventory.web.mappers;

import com.vikash.beerinventory.domain.BeerInventory;
import com.vikash.beerinventory.web.model.BeerInventoryDto;
import org.mapstruct.Mapper;

@Mapper(uses=DateMapper.class)
public interface BeerInventoryMapper {

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDto);
}
