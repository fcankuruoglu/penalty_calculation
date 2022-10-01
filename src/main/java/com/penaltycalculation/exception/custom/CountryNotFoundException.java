package com.penaltycalculation.exception.custom;

import com.penaltycalculation.exception.base.ValidationException;

import java.text.MessageFormat;

public class CountryNotFoundException extends ValidationException {
    private static final String MESSAGE = "A country associated with given {0} was not found. {0}:[1}";
    public CountryNotFoundException(Long id) {
        super(MessageFormat.format(MESSAGE, "ID", id));
    }
    }

