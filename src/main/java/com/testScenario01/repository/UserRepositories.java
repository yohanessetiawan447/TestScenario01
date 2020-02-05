package com.testScenario01.repository;

import com.testScenario01.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepositories extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM user WHERE id = :id", nativeQuery = true)
    List<User> getUserById(@Param("id") String id);




}
