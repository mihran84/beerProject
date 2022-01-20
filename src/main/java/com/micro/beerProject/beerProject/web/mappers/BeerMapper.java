package com.micro.beerProject.beerProject.web.mappers;

import com.micro.beerProject.beerProject.web.mode.BeerDto;
import org.mapstruct.Mapper;
import com.micro.beerProject.beerProject.domain.Beer;
import org.mapstruct.Mapping;

@Mapper
public interface BeerMapper {
     BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);

}
