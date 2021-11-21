package com.micro.beerProject.beerProject.web.controller;

import com.micro.beerProject.beerProject.web.mode.BeerDto;
import com.micro.beerProject.beerProject.web.mode.CustomerDto;
import com.micro.beerProject.beerProject.web.sevice.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerContoller {

    private final CustomerService customerService;

    public CustomerContoller(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId){

  return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK) ;

    }

}
