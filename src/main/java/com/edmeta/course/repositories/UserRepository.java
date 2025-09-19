package com.edmeta.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edmeta.course.entities.User;
//nao precisa defininr implementacao da interface pq o jparepository ja possui implement padrao
public interface UserRepository extends JpaRepository<User, Long>{

}
