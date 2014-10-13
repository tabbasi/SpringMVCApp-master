package com.springapp.mvc;

import com.springapp.mvc.model.country.CountryEntity;

import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by tabbasi on 12/10/14.
 */
public interface CountryRepository extends JpaRepository<CountryEntity, Long>  {

}
