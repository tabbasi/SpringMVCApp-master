package com.springapp.mvc;

import com.springapp.mvc.model.invitation.InvitationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 13/10/14.
 */
public interface InvitationRepository  extends JpaRepository <InvitationEntity , Long>{
}
