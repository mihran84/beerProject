package com.micro.beerProject.beerProject.web.sevice;

import com.micro.beerProject.beerProject.web.mode.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("skol").beerStyle("refresh").upc(5L).build();
    }
}
