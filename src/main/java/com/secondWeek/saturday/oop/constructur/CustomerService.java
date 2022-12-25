package com.secondWeek.saturday.oop.constructur;

public class CustomerService {
    public boolean isAdmin;

//    public CustomerService(){
//        System.out.println("Customer service şuan ayakta.");
//    }

    public CustomerService(boolean isAdmin){
//        this();
        this.isAdmin = isAdmin;
    }

//    public CustomerService(boolean isAdmin, int customerId){
//        this(isAdmin);
//        this.isAdmin = isAdmin;
//    }

    public void getCustomerInfo(){
        if(isAdmin){
            System.out.println("Müsterinin tüm bilgilerine erişildi.");
        } else {
            System.out.println("Müsterinin yalnızca isim ve numrara bilgilerine erişildi.");
        }

    }

}
