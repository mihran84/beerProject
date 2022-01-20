package com.micro.beerProject.beerProject.sevices;

import com.micro.beerProject.beerProject.web.mode.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        log.debug("getCustomerById " +customerId);
        return CustomerDto.builder().id(UUID.randomUUID()).name("Karam").build();
    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        log.debug("addCustomer "+ customerDto.getId());
        return customerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        log.debug("updateCustomer "+ customerDto.getId());
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        log.debug("deleteCustomer "+ customerId);
    }
}
