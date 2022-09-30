package com.penaltycalculation.domains.dtos;

import com.penaltycalculation.domains.models.Country;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CountryDisplayDTO {
    private Long id;
    private String name;

    public static List<CountryDisplayDTO> fromEntityListToDTOList(List<Country> countries){
        List<CountryDisplayDTO> countryDisplayDTOList = new ArrayList<>();
        for (Country country : countries){
            CountryDisplayDTO tmp = new CountryDisplayDTO();
            tmp.setId(country.getId());
            tmp.setName(country.getName());
            countryDisplayDTOList.add(tmp);
        }
        return countryDisplayDTOList;
    }

}
