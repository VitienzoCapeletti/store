package com.vitienzo.store.repositories;

import com.vitienzo.store.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {




}
