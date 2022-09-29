package com.penaltycalculation.domains.dtos;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CountryDTO {
    private String name;
    private String currency;
    private BigDecimal penalty_amount;
    private List<HolidayDTO> holidays;
}
