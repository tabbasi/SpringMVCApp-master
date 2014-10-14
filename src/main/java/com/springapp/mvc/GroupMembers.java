package com.springapp.mvc;

import com.springapp.mvc.model.groupmembers.GroupMembersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 13/10/14.
 */
public interface GroupMembers extends JpaRepository<GroupMembersEntity , Long>{
}
