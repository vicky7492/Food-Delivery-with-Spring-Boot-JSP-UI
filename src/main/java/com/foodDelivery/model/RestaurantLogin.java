package com.foodDelivery.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RestaurantLogin {
    @Id
    private Long restaurantId;
    private String password;

    public RestaurantLogin() {
        super();
    }

    public RestaurantLogin(Long restaurantId, String password) {
        this.restaurantId = restaurantId;
        this.password = password;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
