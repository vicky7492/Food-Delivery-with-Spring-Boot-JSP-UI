package com.foodDelivery.service;

import com.foodDelivery.model.Customer;
import com.foodDelivery.model.CustomerLogin;
import com.foodDelivery.repository.CustomerLoginRepo;
import com.foodDelivery.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerService {
    
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private CustomerLoginRepo customerLoginRepo;
    
    public String registerCustomer(Customer customer,String password){
        if(password.equals("") || password.equals(null)){
            return "Fill Password";
        } else if (password.length()<6) {
            return "Password Length should be 6 or more";
        }else {
            Long customerId = customerRepo.save(customer).getCustomerId();

            CustomerLogin customerLogin = new CustomerLogin(customerId,password);
            customerLoginRepo.save(customerLogin);

            return "Registered Successfully with Customer Id "+ customerId;
        }
    }

    public String verify(Long customerId,String password){
        if(customerLoginRepo.existsById(customerId)){
            if(customerLoginRepo.findById(customerId).get().getPassword().equals(password)){
                return "verified";
            }else return "Wrong Password";
        }else return "Invalid User";
    }
}
