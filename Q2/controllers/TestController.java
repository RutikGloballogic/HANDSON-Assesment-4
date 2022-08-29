package com.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;

@RestController

public class TestController {

 @RequestMapping(value = "/customer", method = RequestMethod.GET)

 public Customer firstPage() {

	 Customer cust = new Customer();

 cust.setCustomername("cust1");

 cust.setCustomerid(101);;

 cust.setCustomeraddress("rk puram");
 
 cust.setCustomerphone("9068794536");

 return cust;

 }

}