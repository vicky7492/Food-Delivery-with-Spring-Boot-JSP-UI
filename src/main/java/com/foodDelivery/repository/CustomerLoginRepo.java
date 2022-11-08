package com.foodDelivery.repository;

import com.foodDelivery.model.CustomerLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerLoginRepo extends JpaRepository<CustomerLogin,Long> {
}
