package com.springapp.mvc;

import com.springapp.mvc.model.notifications.NotificationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 14/10/14.
 */
public interface NotificationsRepository extends JpaRepository<NotificationsEntity , Long>{
}
