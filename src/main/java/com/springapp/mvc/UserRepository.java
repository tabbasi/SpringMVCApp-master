package com.springapp.mvc;

import com.springapp.mvc.model.profiles.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UsersEntity, Long> {
}
