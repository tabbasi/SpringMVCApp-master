package com.springapp.mvc;

import com.springapp.mvc.model.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by tabbasi on 13/10/14.
 */
public interface ActivityRepository extends JpaRepository <AccountEntity , Long>{
}
