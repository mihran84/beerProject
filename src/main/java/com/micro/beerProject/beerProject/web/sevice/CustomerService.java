package com.micro.beerProject.beerProject.web.sevice;

import com.micro.beerProject.beerProject.web.mode.BeerDto;
import com.micro.beerProject.beerProject.web.mode.CustomerDto;

import java.util.UUID;


public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);
}
