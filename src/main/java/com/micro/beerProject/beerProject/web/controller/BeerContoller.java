package com.micro.beerProject.beerProject.web.controller;

import com.micro.beerProject.beerProject.web.mode.BeerDto;
import com.micro.beerProject.beerProject.sevices.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerContoller {

    private final BeerService beerService;

    public BeerContoller(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/all"})
    public ResponseEntity<List<BeerDto>> findBeerAll(){
List<BeerDto> listBeer = beerService.findAll();
        return new ResponseEntity<>(listBeer, HttpStatus.OK) ;

    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> findBeerById(@PathVariable UUID beerId){

        return new ResponseEntity<>(beerService.findBeerById(beerId), HttpStatus.OK) ;

    }


    @GetMapping({"/upc/{upc}"})
    public ResponseEntity<BeerDto> findBeerByUpc(@PathVariable String upc){

        return new ResponseEntity<>(beerService.findBeerByUpc(upc), HttpStatus.OK) ;

    }
@PostMapping
    public ResponseEntity saveBeer( @RequestBody @Valid BeerDto beerDto){
     beerDto = beerService.saveBeerById(beerDto) ;

    HttpHeaders httpHeaders = new HttpHeaders() ;
    httpHeaders.add("location" ,"/api/v1/beer/" +beerDto.getId().toString());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED) ;

    }

    @PutMapping({"/{beerId}"})
    public ResponseEntity updateBeer(@PathVariable UUID beerId , @RequestBody BeerDto beerDto){
       beerService.updateBeer(beerId ,beerDto) ;

        HttpHeaders httpHeaders = new HttpHeaders() ;

        return new ResponseEntity<>(httpHeaders, HttpStatus.NO_CONTENT) ;

    }

    @DeleteMapping ({"/{beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){
        beerService.deleteBeer(beerId ) ;




    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> validatorHandler(Exception e){
        System.out.println("errrrrooorrrrrrrrrrrrrrrr");
        HttpHeaders httpHeaders = new HttpHeaders() ;
        httpHeaders.add("error" , e.getMessage());
        return new ResponseEntity<>(httpHeaders, HttpStatus.CREATED) ;

    }
}
