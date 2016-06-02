package com;

import org.glassfish.hk2.utilities.binding.AbstractBinder;


public class ApplicationBinder extends AbstractBinder {

    //Here you have to configure the binding relationships
    @Override
    protected void configure() {
        bind(new CustomerService()).to(CustomerService.class);
    }
}
