package com.foodDelivery.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter

@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long customerId;
    String customerName;
    String customerAge;
    String customerMobile;
    String customerAddress;


//    public Customer() {
//        super();
//    }
//
//    public Customer(Long customerId, String customerName, String customerAge, String customerMobile, String customerAddress) {
//        this.customerId = customerId;
//        this.customerName = customerName;
//        this.customerAge = customerAge;
//        this.customerMobile = customerMobile;
//        this.customerAddress = customerAddress;
//    }
//
//    public Long getCustomerId() {
//        return customerId;
//    }
//
//    public void setCustomerId(Long customerId) {
//        this.customerId = customerId;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getCustomerAge() {
//        return customerAge;
//    }
//
//    public void setCustomerAge(String customerAge) {
//        this.customerAge = customerAge;
//    }
//
//    public String getCustomerMobile() {
//        return customerMobile;
//    }
//
//    public void setCustomerMobile(String customerMobile) {
//        this.customerMobile = customerMobile;
//    }
//
//    public String getCustomerAddress() {
//        return customerAddress;
//    }
//
//    public void setCustomerAddress(String customerAddress) {
//        this.customerAddress = customerAddress;
//    }
}
