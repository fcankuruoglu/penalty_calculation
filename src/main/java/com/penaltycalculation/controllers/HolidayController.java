package com.penaltycalculation.controllers;

import com.penaltycalculation.domains.dtos.HolidayDTO;
import com.penaltycalculation.services.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/holiday")
public class HolidayController {
    private final HolidayService holidayService;
    @Autowired
    public HolidayController(HolidayService holidayService) {
        this.holidayService = holidayService;
    }
    @GetMapping("/getByCountry/{id}")
    public List<HolidayDTO> getAllByCountryId(@PathVariable("id") Long id){
        return this.holidayService.getAllByCountryId(id);
    }
}
