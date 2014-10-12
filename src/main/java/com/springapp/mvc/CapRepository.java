package com.springapp.mvc;

import com.springapp.mvc.model.address.CapEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 12/10/14.
 */
public interface CapRepository
    extends JpaRepository<CapEntity, Long>
{
}
