package com.thirdWeek.sunday.designpattern.singleton;

/**
 * Constructor private olmalı. Bu yapılan işlem new ile nesne oluşturulmasını engeller.
 * Class ile aynı türde static bir member oluşturulur.
 * Örneğin;
 * class SingletonExample {
 * private static SingletonExample instance;
 * }
 * Static member’a ulaşmak için static bir metot oluşturulmalıdır.
 * Örneğin;
 * public static Singleton getInstance() { … return instance; }
 */

public class SingletonExample {
    private static SingletonExample instance;

    private SingletonExample(){}

    public static SingletonExample getInstance(){

        if (instance == null){
            instance = new SingletonExample();
        }

        return instance;
    }
}
