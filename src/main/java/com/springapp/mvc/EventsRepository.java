package com.springapp.mvc;

import com.springapp.mvc.model.events.EventsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 13/10/14.
 */
public interface EventsRepository extends  JpaRepository<EventsEntity , Long>{
}
