package com.micro.beerProject.beerProject.web.mappers;

import com.micro.beerProject.beerProject.domain.Customer;
import com.micro.beerProject.beerProject.web.mode.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto CustomerToCustomerDto(Customer customer);
    Customer CustomerDtoToCustomer(CustomerDto customerDto);
}
