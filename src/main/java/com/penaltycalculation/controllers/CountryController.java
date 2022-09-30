package com.penaltycalculation.controllers;

import com.penaltycalculation.domains.dtos.CountryDTO;
import com.penaltycalculation.domains.dtos.CountryDisplayDTO;
import com.penaltycalculation.domains.models.Country;
import com.penaltycalculation.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
@CrossOrigin(origins = "http://localhost:3000/flex")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping("/getById/{id}")
    CountryDTO getById(@RequestParam @PathVariable("id") Long id){
        return this.countryService.getById(id);
    }

    // getting country to use in react with id, name

    @GetMapping("/all")
    ResponseEntity<List<CountryDisplayDTO>> getAll(){
        return ResponseEntity.ok().body(this.countryService.getAll());
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
