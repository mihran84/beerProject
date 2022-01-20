package com.micro.beerProject.beerProject.sevices;

import com.micro.beerProject.beerProject.web.mode.BeerDto;


import java.util.List;
import java.util.UUID;


public interface BeerService {

    BeerDto findBeerById(UUID beerId);

    BeerDto saveBeerById(BeerDto beerDto);

    void updateBeer( UUID beerId ,BeerDto beerDto);

    void deleteBeer(UUID beerId);

    BeerDto findBeerByUpc(String upc);

    List<BeerDto> findAll();
}
