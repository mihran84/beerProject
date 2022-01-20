package com.micro.beerProject.beerProject.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


import java.util.UUID;


@WebMvcTest(CustomerContoller.class)
@ComponentScan("com.micro.beerProject.beerProject")
class CustomerContollerTest {

    @Autowired
    MockMvc mock ;

    @Test
    void getCustomer() throws Exception {
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