package com.secondWeek.sunday.oop.abstractlesson;

public class Dentist extends AbstractDoctor implements IMaasHesapla{

    int aylikHastaSayisi;

    @Override
    public void maasHesapla() {

        int doktorMaas = aylikHastaSayisi * 3;
        System.out.println("Doktor's Salary: " + doktorMaas);
    }

    @Override
    public void yemekYe() {

    }


    @Override
    public void muayene() {
        System.out.println("Diş muayenesi yap");
    }
}
