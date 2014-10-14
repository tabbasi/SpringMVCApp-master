package com.springapp.mvc;

import com.springapp.mvc.model.specialrequirments.SpecialRequirementsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 14/10/14.
 */
public interface SpecialRequirmentsRepository extends JpaRepository<SpecialRequirementsEntity,Long>{
}
