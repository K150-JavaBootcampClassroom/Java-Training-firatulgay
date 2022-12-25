package com.secondWeek.sunday.oop;

public class Ogretmen { // public kaldırılırsa farklı paketteki kendisinin kullanıldığı her yer patlar

    public String adi;
    public int yasi;
    public static int maas;

    protected String soyad;
    private String okulu;

    public void okulaGit(){
        System.out.println("Öğretmen okula gider.");
    }

    public static void main(String[] args) {
//        okulaGit();
//        adi = "Fırat";
//        yasi = 30;
//        System.out.println("Öğretmen adı:" + adi + "yaşı:" + yasi);
    }


}
