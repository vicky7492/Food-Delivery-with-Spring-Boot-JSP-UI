package com.foodDelivery.controller;

import com.foodDelivery.model.Restaurant;
import com.foodDelivery.repository.RestaurantRepo;
import com.foodDelivery.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private RestaurantRepo restaurantRepo;

    @GetMapping("RHome")
    public String restaurantLandingPage(){
        return "RestaurantHome";
    }

    @GetMapping("/registerRestaurant")
    public String restaurantRegisterPage(){
        return "RegisterRestaurant";
    }

    @GetMapping("/loginRestaurant")
    public String restaurantLoginPage(){
        return "LoginRestaurant";
    }

    @PostMapping("/registerRestaurant")
    public ModelAndView restaurantRegister(@ModelAttribute Restaurant restaurant,String password, BindingResult bindingResult, ModelMap modelMap){
        String message = restaurantService.registerRestaurant(restaurant,password);
        modelMap.addAttribute("message",message);
        return new ModelAndView("RegisterRestaurant",modelMap);
    }

    @PostMapping("/loginRestaurant")
    public ModelAndView restaurantLogin(@ModelAttribute Restaurant restaurant, @RequestParam String password,BindingResult bindingResult,ModelMap modelMap){
        String message = restaurantService.verifyRestaurant(restaurant.getRestaurantId(),password);
        if(message.equals("verified")){
            Optional<Restaurant> restaurants = Optional.ofNullable(restaurantRepo.findById(restaurant.getRestaurantId()).orElse(null));
            if(restaurants.isPresent()){
                modelMap.addAttribute("list",restaurants.get());
            }
            return new ModelAndView("RestaurantHome",modelMap);
        }
        else{
            modelMap.addAttribute("message",message);
            return new ModelAndView("LoginRestaurant",modelMap);
        }
    }

}
