package com.foodDelivery.repository;

import com.foodDelivery.model.Foods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends JpaRepository<Foods,Long> {
}
