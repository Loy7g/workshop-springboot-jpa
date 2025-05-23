package com.projetojavaworkshop.work.repositories;

import com.projetojavaworkshop.work.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {



}
