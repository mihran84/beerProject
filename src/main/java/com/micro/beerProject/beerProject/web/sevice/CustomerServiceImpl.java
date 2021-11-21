package com.micro.beerProject.beerProject.web.sevice;

import com.micro.beerProject.beerProject.web.mode.BeerDto;
import com.micro.beerProject.beerProject.web.mode.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Karam").build();
    }
}
