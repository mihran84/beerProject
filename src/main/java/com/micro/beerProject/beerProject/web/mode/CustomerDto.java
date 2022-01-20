package com.micro.beerProject.beerProject.web.mode;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    private UUID id ;
    private String name ;
    private LocalDate createdDate ;
    private LocalDate lastModifiedDate ;
}
