package com.penaltycalculation.daos;

import com.penaltycalculation.domains.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CountryDao extends JpaRepository<Country, Long> {
    Country findCountryById(Long id);
    List<Country> findAllByOrderByIdAsc();

}
