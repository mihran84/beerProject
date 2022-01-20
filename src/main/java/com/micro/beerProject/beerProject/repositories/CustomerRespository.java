package com.micro.beerProject.beerProject.repositories;

import com.micro.beerProject.beerProject.domain.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CustomerRespository  extends PagingAndSortingRepository<Customer, UUID> {
}
