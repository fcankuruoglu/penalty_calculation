package com.penaltycalculation.exception.custom;

import com.penaltycalculation.exception.base.ValidationException;

import java.text.MessageFormat;
import java.time.LocalDate;

public class ReturnedDateException extends ValidationException {
    private static final String MESSAGE = "Date the book is returned must be after date the book is checkout. WRONG DATE = {0}";
    public ReturnedDateException(LocalDate returnedDate) {
        super(MessageFormat.format(MESSAGE, returnedDate));
    }
}
