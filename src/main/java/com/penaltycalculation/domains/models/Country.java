package com.penaltycalculation.domains.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "countries")
@Getter
@Setter
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "country_name")
    private String name;
    @Column(name = "country_currency")
    private String currency;
    @Column(name = "country_penalty_amount")
    private BigDecimal penalty_amount;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "country")
    private List<Holiday> holidays;
}
