package com.penaltycalculation.services;

import com.penaltycalculation.daos.CountryDao;
import com.penaltycalculation.domains.dtos.CountryDTO;
import com.penaltycalculation.domains.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    private CountryDao countryDao;

    @Override
    public CountryDTO getById(Long id) {
        return CountryDTO.fromEntityToDTO(this.countryDao.getById(id));
    }

    @Override
    public List<Country> getAllById(Long id) {
        return this.countryDao.getAllById(id);
    }

    @Override
    public CountryDTO getByName(String name) {
        return CountryDTO.fromEntityToDTO(this.countryDao.findByName(name));
    }
    @Override
    public boolean isExist(Long id){
        return this.countryDao.existsById(id);
    }
}
