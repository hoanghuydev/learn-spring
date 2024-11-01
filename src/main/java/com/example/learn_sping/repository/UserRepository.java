package com.example.learn_sping.repository;

import com.example.learn_sping.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
