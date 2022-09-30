package com.penaltycalculation;

import com.penaltycalculation.daos.CountryDao;
import com.penaltycalculation.daos.HolidayDao;
import com.penaltycalculation.domains.dtos.HolidayDTO;
import com.penaltycalculation.domains.models.Holiday;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.time.LocalDate;

@SpringBootApplication
@EnableSwagger2
public class PenaltyCalculationApplication{
    HolidayDao holidayDao;
    CountryDao countryDao;
    public static void main(String[] args) {
        SpringApplication.run(PenaltyCalculationApplication.class, args);
    }
 /*   @Override
    public void run(String... args) throws Exception
    {
        // Inserting the data in the mysql table.
        LocalDate date = LocalDate.parse("2022-07-01");
        Holiday holiday = new Holiday(null, "Zort",date, countryDao.getById(1L));
        holidayDao.save(holiday);

    }*/
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .build();
    }

}
