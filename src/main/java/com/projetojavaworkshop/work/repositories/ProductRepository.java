package com.projetojavaworkshop.work.repositories;


import com.projetojavaworkshop.work.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {



}
