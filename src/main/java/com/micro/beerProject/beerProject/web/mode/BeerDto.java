package com.micro.beerProject.beerProject.web.mode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
@Null
    private UUID id ;

@NotNull
    private String beerName ;
    private BeerStyle beerStyle;
    private Long  upc ;
    private Integer quantityOnHand ;
   @Min(10)
    private BigDecimal price ;

    private LocalDate createdDate ;
    private LocalDate lastModifiedDate ;

}
