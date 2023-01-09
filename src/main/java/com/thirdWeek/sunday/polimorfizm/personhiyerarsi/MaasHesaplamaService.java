package com.thirdWeek.sunday.polimorfizm.personhiyerarsi;

public class MaasHesaplamaService {

    public void maasHesapla(Employee employee) {

        if(employee instanceof Manager){
            Manager manager = (Manager) employee;
            manager.setDepartman("IT");
        } else if (employee instanceof Engineer) {
            Engineer engineer = (Engineer) employee;
            engineer.setAdi("Mehmet");
        }

        int employeeMaas = employee.maasHesapla();
        System.out.println("Employee salary: " + employeeMaas);


    }

}
