package com.foodDelivery.service;

import com.foodDelivery.model.Restaurant;
import com.foodDelivery.model.RestaurantLogin;
import com.foodDelivery.repository.FoodRepo;
import com.foodDelivery.repository.RestaurantLoginRepo;
import com.foodDelivery.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RestaurantService {

    @Autowired
    private RestaurantRepo restaurantRepo;
    @Autowired
    private FoodRepo foodRepo;
    @Autowired
    private RestaurantLoginRepo restaurantLoginRepo;

    public String registerRestaurant(Restaurant restaurant,String password){

        Long restaurantId = restaurantRepo.save(restaurant).getRestaurantId();

        RestaurantLogin restaurantLogin = new RestaurantLogin(restaurantId,password);

        restaurantLoginRepo.save(restaurantLogin);

        return "Restaurant Account Successfully created with RestaurantId  " + restaurantId;

    }

    public String verifyRestaurant(Long restaurantId,String password){
        Optional<RestaurantLogin> restaurantLoginList = restaurantLoginRepo.findById(restaurantId);
        if(restaurantLoginList.isPresent()){
            if(restaurantLoginList.get().getPassword().equals(password)){
                return "verified";
            }else return "Password is Wrong";
        }else return "Invalid User";
    }
}
