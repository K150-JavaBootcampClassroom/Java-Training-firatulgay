package com.thirdWeek.sunday.polimorfizm.personhiyerarsi;

public class Engineer extends Employee {

    int maasKatSayi;
    @Override
    public void work() {
        super.work();
        System.out.println("Engineer works");
    }

    /**
     * Engineer maaşı normal Employee e göre yüzde 30 daha fazla
     */
    @Override
    public int maasHesapla() {
        int employeeSalary = super.maasHesapla();
        employeeSalary = employeeSalary + ((employeeSalary*30) / 100);
        return employeeSalary;
    }
}
