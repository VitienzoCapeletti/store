package com.vitienzo.store.repositories;

import com.vitienzo.store.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
