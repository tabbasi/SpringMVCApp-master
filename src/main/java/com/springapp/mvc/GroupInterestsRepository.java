package com.springapp.mvc;

import com.springapp.mvc.model.groupsinterests.GroupsInterstsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 14/10/14.
 */
public interface GroupInterestsRepository extends JpaRepository<GroupsInterstsEntity , Long> {
}
