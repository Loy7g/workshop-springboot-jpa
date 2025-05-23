package com.projetojavaworkshop.work.repositories;

import com.projetojavaworkshop.work.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
