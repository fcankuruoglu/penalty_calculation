package com.penaltycalculation.daos;

import com.penaltycalculation.domains.models.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HolidayDao extends JpaRepository<Holiday, Long> {
    List<Holiday> getAllByCountry_Id(Long countryId);
}
