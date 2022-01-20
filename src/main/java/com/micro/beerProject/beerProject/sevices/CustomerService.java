package com.micro.beerProject.beerProject.sevices;

import com.micro.beerProject.beerProject.web.mode.CustomerDto;

import java.util.UUID;


public interface CustomerService {

    CustomerDto getCustomerById(UUID customerId);

    CustomerDto addCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
