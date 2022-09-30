package com.penaltycalculation.controllers;

import com.penaltycalculation.domains.dtos.CountryDTO;
import com.penaltycalculation.domains.dtos.HolidayDTO;
import com.penaltycalculation.domains.dtos.ResponseDTO;
import com.penaltycalculation.services.CountryService;
import com.penaltycalculation.services.HolidayService;
import com.penaltycalculation.utils.utils;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/penalty")
public class PenaltyController {
    private final HolidayService holidayService;
    private final CountryService countryService;

    public PenaltyController(HolidayService holidayService, CountryService countryService) {
        this.holidayService = holidayService;
        this.countryService = countryService;
    }

    @GetMapping("/calculate/{id}")
    public ResponseDTO penaltyCalculate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkedOutDate,
                                        @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate returnedDate,
                                        @PathVariable(value = "id") Long countryId) throws ParseException {

        CountryDTO country = countryService.getById(countryId);
        List<HolidayDTO> holidayDTOList =holidayService.getAllByCountryId(countryId);
        int businessDays = utils.findBusinessDays(checkedOutDate, returnedDate, holidayDTOList, country.getWeekends());
        BigDecimal penalty = utils.calculatePenalty(businessDays, countryService.getById(countryId).getPenaltyAmount());

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setBusinessDays(businessDays);
        responseDTO.setPenalty(penalty);
        responseDTO.setCurrency(country.getCurrency());
        return responseDTO;
    }
}
