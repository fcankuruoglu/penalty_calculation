package com.penaltycalculation.services;

import com.penaltycalculation.daos.HolidayDao;
import com.penaltycalculation.domains.dtos.HolidayDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class HolidayServiceImpl implements HolidayService{
    @Autowired
    private HolidayDao holidayDao;
    @Override
    public List<HolidayDTO> getAllByCountryId(Long id) {
        return HolidayDTO.fromEntityListToDTOList(holidayDao.getAllByCountry_Id(id));
    }

}
