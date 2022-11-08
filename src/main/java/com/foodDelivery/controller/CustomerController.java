package com.foodDelivery.controller;

import com.foodDelivery.model.Customer;
import com.foodDelivery.repository.CustomerLoginRepo;
import com.foodDelivery.repository.CustomerRepo;
import com.foodDelivery.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    CustomerLoginRepo customerLoginRepo;

    @GetMapping("")
    public String landingPage(){
        return "Home";
    }

    @GetMapping("CHome")
    public String customerLandingPage(){
        return "CustomerHome";
    }

    @GetMapping("/login")
    public String loginCustomerPage(){
        return "LoginCustomer";
    }

    @GetMapping("/register")
    public String registerCustomerPage(){
        return "RegisterCustomer";
    }


    @PostMapping("/register")
    public ModelAndView registerCustomer(@ModelAttribute Customer customer, @RequestParam String password, BindingResult bindingResult, ModelMap modelMap){
        String message = customerService.registerCustomer(customer,password);
        modelMap.addAttribute("message",message);
        return new ModelAndView("RegisterCustomer",modelMap);
    }



    @PostMapping("/login")
    public ModelAndView LoginCustomer(@ModelAttribute Customer customer, @RequestParam String password, BindingResult bindingResult,ModelMap modelMap){
        String message = customerService.verify(customer.getCustomerId(),password);
        if(message.equals("verified")){
            Optional<Customer> customers = Optional.ofNullable(customerRepo.findById(customer.getCustomerId()).orElse(null));
            if(customers.isPresent()){
                modelMap.addAttribute("list",customers.get());
            }
            return new ModelAndView("CustomerHome",modelMap);
        }else {
            modelMap.addAttribute("message",message);
            return new ModelAndView("LoginCustomer",modelMap);
        }

    }

}
