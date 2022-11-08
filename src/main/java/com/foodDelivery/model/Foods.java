package com.foodDelivery.model;

import javax.persistence.*;

@Entity
public class Foods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodId;
    private String foodCategory;
    private String foodName;
    private String foodPrice;
    private Long restaurantId;

    public Foods() {
        super();
    }

    public Foods(String foodCategory, String foodName, String foodPrice,Long restaurantId) {
        this.foodCategory = foodCategory;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.restaurantId=restaurantId;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }
}
