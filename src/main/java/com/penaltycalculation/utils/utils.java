package com.penaltycalculation.utils;

import com.penaltycalculation.domains.dtos.HolidayDTO;
import com.penaltycalculation.domains.dtos.WeekendDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class utils {
    public static int findBusinessDays(LocalDate start, LocalDate end, List<HolidayDTO> holidayList, List<WeekendDTO> weekends){
        int businessDays =0;
        int numberOfHolidays=0;
        int numberOfWeekends = 0;


        for (LocalDate i = start; i.isBefore(end.plusDays(1));i = i.plusDays(1)) {
            numberOfHolidays = 0;
            for (HolidayDTO holiday : holidayList) {
                if (i.getDayOfMonth() == holiday.getDate().getDayOfMonth() && i.getMonth() == holiday.getDate().getMonth()) {
                    numberOfHolidays++;
                }
            }
            for (WeekendDTO weekend : weekends){
                if (i.getDayOfWeek().equals(weekend.getDay())) {
                    numberOfWeekends++;
                }
            }
            businessDays++;
        }
         businessDays= businessDays - numberOfHolidays - numberOfWeekends;
        return businessDays;
    }

    public static BigDecimal calculatePenalty(int businessDays, BigDecimal countryPenaltyAmount){
        BigDecimal totalPenalty = BigDecimal.ZERO;
        if (businessDays > 10){
            totalPenalty = countryPenaltyAmount.multiply(BigDecimal.valueOf(businessDays- 10));
        }
        return totalPenalty;
    }

}
