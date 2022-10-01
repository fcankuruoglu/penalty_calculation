package com.penaltycalculation.domains.dtos;

import com.penaltycalculation.domains.models.Weekend;
import lombok.Data;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

@Data
public class WeekendDTO {
    private DayOfWeek day;

    public static WeekendDTO fromEntityToDTO(Weekend weekend){
        WeekendDTO weekendDTO = new WeekendDTO();
        weekendDTO.setDay(weekend.getDay());
        return weekendDTO;
    }
    public static List<WeekendDTO> fromEntityListToDTOList(List<Weekend> weekends){
        List<WeekendDTO> weekendDTOList = new ArrayList<>();
        for (Weekend weekend : weekends){
            WeekendDTO tmp = new WeekendDTO();
            tmp.setDay(weekend.getDay());
            weekendDTOList.add(tmp);
        }
        return weekendDTOList;
    }
}
