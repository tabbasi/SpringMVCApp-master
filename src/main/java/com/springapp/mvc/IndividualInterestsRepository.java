package com.springapp.mvc;

import com.springapp.mvc.model.individualacceptance.IndividualAcceptanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 14/10/14.
 */
public interface IndividualInterestsRepository extends JpaRepository<IndividualAcceptanceEntity , Long> {
}
