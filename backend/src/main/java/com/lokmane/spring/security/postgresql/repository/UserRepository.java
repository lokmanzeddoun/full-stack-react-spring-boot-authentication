package com.lokmane.spring.security.postgresql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lokmane.spring.security.postgresql.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  Optional<User> findByUsername(String username);

  Optional<User> findByEmail(String email); // Add this method

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);
}
