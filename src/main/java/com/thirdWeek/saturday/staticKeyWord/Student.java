package com.thirdWeek.saturday.staticKeyWord;

/**
 * Sınıf(static) değişkenleri o sınıftan oluşan herhangi bir nesneye özgü değil, sınıfa özgü değişkenlerdir ve sınıfa ait bilgileri taşırlar.
 * İstediğimiz kadar nesne tanımlayalım farketmez sınıf değişkenleri bellekte bir kere yer kaplarlar.
 * Nesne değişkenleri ise oluşturulan nesne kadar bellekte yer kaplarlar.
 */

public class Student {
    private  String name; // instance variable
    private String schoolName;
    private String department;
    public static int studentCount; // class variable

    public Student(){
        studentCount ++;
    }

//  Static method
    public static int getStudentCount(){
        return studentCount;
    }
}
