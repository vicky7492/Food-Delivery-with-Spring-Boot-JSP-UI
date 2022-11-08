package com.foodDelivery.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerLogin {
    @Id
    Long customerId;
    String password;

    public CustomerLogin() {
        super();
    }

    public CustomerLogin(Long customerId, String password) {
        this.customerId = customerId;
        this.password = password;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
