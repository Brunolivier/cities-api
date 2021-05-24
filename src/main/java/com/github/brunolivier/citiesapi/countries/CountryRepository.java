package com.github.brunolivier.citiesapi.countries;

import com.github.brunolivier.citiesapi.countries.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
