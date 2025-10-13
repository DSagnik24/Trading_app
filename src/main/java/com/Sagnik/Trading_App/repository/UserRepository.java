package com.Sagnik.Trading_App.repository;

import com.Sagnik.Trading_App.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
