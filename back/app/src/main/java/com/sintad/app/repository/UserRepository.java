package com.sintad.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sintad.app.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
	@Query(value = "SELECT u FROM User u where u.username = :username")
	public Optional<UserEntity> findByUsername(@Param("username") String username);
	
}
