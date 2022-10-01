package com.penaltycalculation.services;

import com.penaltycalculation.domains.dtos.CountryDTO;
import com.penaltycalculation.domains.dtos.CountryDisplayDTO;

import java.util.List;

public interface CountryService {
    CountryDTO getById(Long id);
    List<CountryDisplayDTO> getAll();

}
