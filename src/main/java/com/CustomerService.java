package com;


public class CustomerService {

    public Customer getCustomerById(String id) {
        //This is a sample code to know how can we implement the custom injection so I am returning some default value
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName("first name");
        customer.setLastName("last name");
        return customer;
    }
}
