package com.micro.beerProject.beerProject.web.controller;

import com.micro.beerProject.beerProject.sevices.CustomerService;
import com.micro.beerProject.beerProject.web.mode.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.util.ArrayList;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any ;
import static org.mockito.BDDMockito.given;


@WebMvcTest(CustomerContoller.class)

class CustomerContollerTest {

    @Autowired
    MockMvc mock ;

    @MockBean
    CustomerService customerService ;

    @Autowired
    CustomerContoller customerContoller;


    @Test
    void getCustomer() throws Exception {
        given(customerService.getCustomerById(any())).willReturn(null);


        mock.perform(MockMvcRequestBuilders.get("/api/v1/customer/"+ UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }


    @Test
    void addCustomer() {
    }

    @Test
    void updateCustomer() {
    }

    @Test
    void testUpdateCustomer() {
    }
}