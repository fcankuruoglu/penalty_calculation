package com.penaltycalculation.domains.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ResponseDTO {
    private Integer businessDays;
    private BigDecimal penalty;
    private String currency;
}
