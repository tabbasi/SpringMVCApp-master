package com.springapp.mvc;

import com.springapp.mvc.model.activityParticipents.ActivityParticipantsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 13/10/14.
 */
public interface ActivityParticipientRepository extends JpaRepository <ActivityParticipantsEntity , Long> {
}
