package com.candido.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candido.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
