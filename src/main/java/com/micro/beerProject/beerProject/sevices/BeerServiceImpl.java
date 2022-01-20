package com.micro.beerProject.beerProject.sevices;

import com.micro.beerProject.beerProject.repositories.BeerRepository;
import com.micro.beerProject.beerProject.web.mode.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository ;

    public BeerServiceImpl(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public BeerDto findBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).beerName("skol").upc(5L).build();
    }

    @Override
    public BeerDto saveBeerById(BeerDto beerDto) {
        return beerDto.builder().id(UUID.randomUUID()).build() ;
    }

    @Override
    public void updateBeer(UUID beerId , BeerDto beerDto) {

    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("deleting "+beerId);
    }

    @Override
    public BeerDto findBeerByUpc(String upc) {
        return null;
    }

    @Override
    public List<BeerDto> findAll() {
         beerRepository.findAll();

         return new ArrayList<BeerDto>();
    }
}
