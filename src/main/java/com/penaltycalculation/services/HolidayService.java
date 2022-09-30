package com.penaltycalculation.services;

import com.penaltycalculation.domains.dtos.HolidayDTO;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public interface HolidayService{
    List<HolidayDTO> getAllByCountryId(Long id);
}
