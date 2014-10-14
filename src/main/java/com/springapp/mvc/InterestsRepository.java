package com.springapp.mvc;

import com.springapp.mvc.model.interests.InterestsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 14/10/14.
 */
public interface InterestsRepository extends JpaRepository<InterestsEntity,Long> {
}
