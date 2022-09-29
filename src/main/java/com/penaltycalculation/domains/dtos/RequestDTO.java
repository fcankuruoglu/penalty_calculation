package com.penaltycalculation.domains.dtos;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import java.util.Date;

@Data
public class RequestDTO {
    @Past
    @DateTimeFormat(pattern = "dd/MM/yy")
    @NotEmpty(message = "Please enter date that book is checked out.")
    private Date checkedOutDate;
    @FutureOrPresent
    @DateTimeFormat(pattern = "dd/MM/yy")
    @NotEmpty(message = "Please enter date that book is returned.")
    private Date returnedDate;
    private Long countryId;
}
