package com.penaltycalculation.exception.custom;

import com.penaltycalculation.exception.base.ValidationException;

import java.text.MessageFormat;
import java.time.LocalDate;

public class DateFormatException extends ValidationException {
    private static final String MESSAGE = "Date({0}) format is wrong. Format should be yyyy-MM-dd. ";
    public DateFormatException(LocalDate date) {
        super(MessageFormat.format(MESSAGE, date));
    }
}
