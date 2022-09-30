package com.penaltycalculation.services;

import com.penaltycalculation.domains.dtos.CountryDTO;
import com.penaltycalculation.domains.dtos.CountryDisplayDTO;
import com.penaltycalculation.domains.dtos.HolidayDTO;
import com.penaltycalculation.domains.models.Country;

import java.util.List;

public interface CountryService {
    CountryDTO getById(Long id);
    List<CountryDisplayDTO> getAll();
    CountryDTO getByName(String name);

    boolean isExist(Long id);
}
