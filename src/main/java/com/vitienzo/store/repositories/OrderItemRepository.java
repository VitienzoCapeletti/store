package com.vitienzo.store.repositories;

import com.vitienzo.store.entities.OrderItem;
import com.vitienzo.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem , Long> {


}
