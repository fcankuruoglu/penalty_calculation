package com.penaltycalculation.domains.dtos;


import com.penaltycalculation.domains.models.Country;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CountryDTO {
    private Long id;
    private String name;
    private String currency;
    private BigDecimal penaltyAmount;
    private List<HolidayDTO> holidays;
    private List<WeekendDTO> weekends;

    public static CountryDTO fromEntityToDTO(Country country){
        CountryDTO countryDTO = new CountryDTO();
        if (country == null){return countryDTO;}
        countryDTO.setId(countryDTO.getId());
        countryDTO.setName(country.getName());
        countryDTO.setCurrency(country.getCurrency());
        countryDTO.setPenaltyAmount(country.getPenaltyAmount());
        countryDTO.setHolidays(HolidayDTO.fromEntityListToDTOList(country.getHolidays()));
        countryDTO.setWeekends(WeekendDTO.fromEntityListToDTOList(country.getWeekends()));

        return countryDTO;
    }

}
