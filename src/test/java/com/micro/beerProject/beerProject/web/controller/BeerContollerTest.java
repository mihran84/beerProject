package com.micro.beerProject.beerProject.web.controller;

import com.micro.beerProject.beerProject.repositories.BeerRepository;
import com.micro.beerProject.beerProject.sevices.BeerService;
import com.micro.beerProject.beerProject.web.mode.BeerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@WebMvcTest(BeerContoller.class)
class BeerContollerTest {

    @MockBean
    BeerService beerService ;

@Autowired
public  BeerContoller beerContoller ;



    @Autowired
    MockMvc mock ;

    @Test
    void saveBeer() {

        when( beerService.saveBeerById(any()) ).thenReturn(BeerDto.builder().beerName("h1").id(UUID.randomUUID()).build());

        BeerDto beerDto = BeerDto.builder().beerName("caisar").price(new BigDecimal(5)).build();
        beerContoller.saveBeer(beerDto) ;
    }

    @Test
    void findAll() throws Exception {

        given(beerService.findAll()).willReturn(new ArrayList<BeerDto>());
        mock.perform(MockMvcRequestBuilders.get("/api/v1/beer/all").accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}