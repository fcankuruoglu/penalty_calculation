package com.penaltycalculation.utils;

import com.penaltycalculation.domains.dtos.HolidayDTO;
import com.penaltycalculation.domains.dtos.WeekendDTO;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class utils {
    public static Date getDateWithoutTimeUsingFormat(Date date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.parse(formatter.format(date));
    }
    public static int findBusinessDays(LocalDate start, LocalDate end, List<HolidayDTO> holidayList, List<WeekendDTO> weekends){
        // start end between days int
        int businessDays =0;
        int numberOfHolidays=0;
        int numberOfWeekends = 0;
        // Weeekend entity and its dtos are created.

        for (LocalDate i = start; i.isBefore(end.plusDays(1));i = i.plusDays(1)) {
            numberOfHolidays = 0;
            for (HolidayDTO holiday : holidayList) {
                if (i.getDayOfMonth() == holiday.getDate().getDayOfMonth() && i.getMonth() == holiday.getDate().getMonth()) {
                    System.out.println("EQUALS--- date: " + i + " /holiday: " + holiday + " /dayOfWeek: " + i.getDayOfWeek());
                    numberOfHolidays++;
                }
            }
            for (WeekendDTO weekend : weekends){
                if (i.getDayOfWeek().equals(weekend.getDay())) {
                    System.out.println("EQUALS--- date: " + weekend.getDay() + " /dayOfWeek: " + i.getDayOfWeek());
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
            totalPenalty = countryPenaltyAmount.multiply(BigDecimal.valueOf(businessDays));
        }
        return totalPenalty;
    }

}
