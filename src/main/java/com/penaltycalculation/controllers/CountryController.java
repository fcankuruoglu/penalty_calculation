package com.penaltycalculation.controllers;

import com.penaltycalculation.domains.dtos.CountryDisplayDTO;
import com.penaltycalculation.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/country")
@CrossOrigin(origins = "http://localhost:3000")
public class CountryController {
    @Autowired
    private CountryService countryService;
    @GetMapping("/all")
    ResponseEntity<List<CountryDisplayDTO>> getAll(){
        return ResponseEntity.ok().body(this.countryService.getAll());
    }

}
