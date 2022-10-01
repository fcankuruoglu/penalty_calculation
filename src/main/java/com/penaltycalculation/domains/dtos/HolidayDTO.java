package com.penaltycalculation.domains.dtos;

import com.penaltycalculation.domains.models.Holiday;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class HolidayDTO {
    private String name;
    private LocalDate date;

    public static HolidayDTO fromEntityToDTO(Holiday holiday){
        HolidayDTO holidayDTO = new HolidayDTO();
        if (holiday == null) {return holidayDTO;}
        holidayDTO.setName(holidayDTO.getName());
        holidayDTO.setDate(holiday.getDate());
        return holidayDTO;
    }
    public static List<HolidayDTO> fromEntityListToDTOList(List<Holiday> holidayList){
        List<HolidayDTO> holidayDTOList = new ArrayList<>();
        for (Holiday holiday : holidayList){
            HolidayDTO tmp = new HolidayDTO();
            tmp.setName(holiday.getName());
            tmp.setDate(holiday.getDate());
            holidayDTOList.add(tmp);
        }
        return holidayDTOList;
    }
}
