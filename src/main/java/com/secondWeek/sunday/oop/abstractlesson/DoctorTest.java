package com.secondWeek.sunday.oop.abstractlesson;

public class DoctorTest {

    public static void main(String[] args) {

        Dentist dentist = new Dentist();
        dentist.maasZamHesaplama(50000, 2, 3);
        dentist.uzmanlik();

        EyeDoctor eyeDoctor = new EyeDoctor();
        eyeDoctor.maasZamHesaplama(50000, 6, 3);
    }
}
