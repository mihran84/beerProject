package com.micro.beerProject.beerProject.web.controller;

import com.micro.beerProject.beerProject.web.mode.CustomerDto;
import com.micro.beerProject.beerProject.sevices.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity addCustomer( @RequestBody CustomerDto customerDto){

        customerDto =  customerService.addCustomer(customerDto) ;

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("location" , "/api/v1/customer/" + customerDto.getId());
        return  new ResponseEntity(httpHeaders, HttpStatus.ACCEPTED);


    }

    @PutMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable UUID customerId , @RequestBody CustomerDto customerDto){

        customerService.updateCustomer(customerId ,customerDto) ;

    }


    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable UUID customerId ){

        customerService.deleteCustomer(customerId ) ;

    }


}
