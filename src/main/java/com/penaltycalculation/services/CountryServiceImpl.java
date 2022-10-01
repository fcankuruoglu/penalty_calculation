package com.penaltycalculation.services;

import com.penaltycalculation.daos.CountryDao;
import com.penaltycalculation.domains.dtos.CountryDTO;
import com.penaltycalculation.domains.dtos.CountryDisplayDTO;
import com.penaltycalculation.domains.models.Country;
import com.penaltycalculation.exception.custom.CountryNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDao countryDao;

    @Override
    public CountryDTO getById(Long id) {
        Country tmp = this.countryDao.findCountryById(id);
        if(ObjectUtils.isEmpty(tmp)) {
            throw new CountryNotFoundException(id);
        }
        return CountryDTO.fromEntityToDTO(this.countryDao.findCountryById(id));
    }

    @Override
    public List<CountryDisplayDTO> getAll() {
        return CountryDisplayDTO.fromEntityListToDTOList(this.countryDao.findAllByOrderByIdAsc());
    }

}
