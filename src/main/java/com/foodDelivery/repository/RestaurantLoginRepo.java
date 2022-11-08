package com.foodDelivery.repository;

import com.foodDelivery.model.RestaurantLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantLoginRepo extends JpaRepository<RestaurantLogin,Long> {
}
