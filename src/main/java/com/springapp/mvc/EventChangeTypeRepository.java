package com.springapp.mvc;

import com.springapp.mvc.model.eventChangetype.EventChangeTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 12/10/14.
 */
public interface EventChangeTypeRepository  extends JpaRepository <EventChangeTypeEntity , Long>{
}
