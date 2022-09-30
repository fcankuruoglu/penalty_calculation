package com.penaltycalculation.daos;

import com.penaltycalculation.domains.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountryDao extends JpaRepository<Country, Long> {

    Country getById(Long id);
    List<Country> getAllById(Long id);
    //Country findById(Long id);

    Country findByName(String name);
    boolean existsById(Long id);
}
