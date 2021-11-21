package com.micro.beerProject.beerProject.web.sevice;

import com.micro.beerProject.beerProject.web.mode.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;


public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
