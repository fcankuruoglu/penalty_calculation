package com.penaltycalculation.daos;

import com.penaltycalculation.domains.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryDao extends JpaRepository<Country, Long> {
}
