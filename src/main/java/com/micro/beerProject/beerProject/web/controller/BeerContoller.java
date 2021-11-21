package com.micro.beerProject.beerProject.web.controller;

import com.micro.beerProject.beerProject.web.mode.BeerDto;
import com.micro.beerProject.beerProject.web.sevice.BeerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerContoller {

    private final BeerService beerService;

    public BeerContoller(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId){

  return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK) ;

    }

}
