package com.penaltycalculation.exception.custom;

import com.penaltycalculation.exception.base.ValidationException;

import java.text.MessageFormat;
import java.time.LocalDate;

public class CheckedOutDateException extends ValidationException {
    private static final String MESSAGE = "Date the book is checked out must be before date the book is returned. WRONG DATE = {0} ";
    public CheckedOutDateException(LocalDate checkedOutDate) {
        super(MessageFormat.format(MESSAGE, checkedOutDate));
    }
}
