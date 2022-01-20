package com.micro.beerProject.beerProject.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;


import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

import java.util.UUID;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(  name = "id", updatable = false, nullable = false)
    private UUID id ;
    @Version
    private Long version ;
    @CreationTimestamp
    private Date createdDate ;
    @UpdateTimestamp
    private Date lastModifiedDate ;
    private String beerName ;
    private String beerStyle;
    private Long  upc ;
    private Integer quantityOnHand ;
    private BigDecimal price ;
}
