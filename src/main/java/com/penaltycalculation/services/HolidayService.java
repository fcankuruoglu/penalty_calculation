package com.penaltycalculation.services;
import com.penaltycalculation.domains.dtos.HolidayDTO;
import java.util.List;

public interface HolidayService{
    List<HolidayDTO> getAllByCountryId(Long id);
}
