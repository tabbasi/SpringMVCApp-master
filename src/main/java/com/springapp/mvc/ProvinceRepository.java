package com.springapp.mvc;

import com.springapp.mvc.model.province.ProvinceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 14/10/14.
 */
public interface ProvinceRepository extends JpaRepository<ProvinceEntity , Long>{
}
