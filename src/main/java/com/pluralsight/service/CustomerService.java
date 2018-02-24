package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by Vesko on 9/17/2017.
 */
public interface CustomerService {
    List<Customer> findAll();
}
