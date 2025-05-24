package com.projetojavaworkshop.work.repositories;

import com.projetojavaworkshop.work.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {



}
