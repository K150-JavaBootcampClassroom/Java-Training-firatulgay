package com.secondWeek.saturday.oop.constructur;

public class CustomerClient {

    public static void main(String[] args) {
        CustomerService customerService = new CustomerService(true);
        customerService.getCustomerInfo();
    }
}
