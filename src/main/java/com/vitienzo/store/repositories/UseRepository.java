package com.vitienzo.store.repositories;

import com.vitienzo.store.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UseRepository extends JpaRepository<User, Long> {


}
