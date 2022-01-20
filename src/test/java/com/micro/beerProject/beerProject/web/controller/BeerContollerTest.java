package com.micro.beerProject.beerProject.web.controller;

import com.micro.beerProject.beerProject.web.mode.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;
import java.util.UUID;

@WebMvcTest
@ComponentScan({"com.micro.beerProject.beerProject" ,"com.micro.beerProject.beerProject.repositories" ,"com.micro.beerProject.beerProject.domain" })
class BeerContollerTest {

@Autowired
public  BeerContoller beerContoller ;

    @Autowired
    MockMvc mock ;

    @Test
    void saveBeer() {

        BeerDto beerDto = BeerDto.builder().beerName("caisar").price(new BigDecimal(5)).build();
        beerContoller.saveBeer(beerDto) ;
    }

    @Test
    void findAll() throws Exception {
        mock.perform(MockMvcRequestBuilders.get("/api/v1/beer/all"+ UUID.randomUUID().toString()).accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}