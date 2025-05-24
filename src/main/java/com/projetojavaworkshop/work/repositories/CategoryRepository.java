package com.projetojavaworkshop.work.repositories;


import com.projetojavaworkshop.work.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {



}
