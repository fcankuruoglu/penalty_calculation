package com.penaltycalculation.controllers;

import com.penaltycalculation.domains.dtos.CountryDTO;
import com.penaltycalculation.domains.models.Country;
import com.penaltycalculation.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/getById/{id}")
    CountryDTO getById(@RequestParam @PathVariable("id") Long id){
        System.out.println(countryService.getById(id));
        return this.countryService.getById(id);
    }

    // getting country to use in react with id, name
    @GetMapping("/all")
    List<Country> getAllById(@RequestParam Long id){
        return this.countryService.getAllById(id);
    }


    @GetMapping("/isExist")
    Boolean isExist(@RequestParam Long id){
        return this.countryService.isExist(id);
    }
    @GetMapping("/getByName/{name}")
    CountryDTO getByName(@PathVariable("name") String name){
        return this.countryService.getByName(name);
    }
}
