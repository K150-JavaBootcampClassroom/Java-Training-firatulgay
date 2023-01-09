package com.thirdWeek.sunday.polimorfizm.casting;

public class CastingTest {

    public static void main(String[] args) {
        /**
         * primitve type'larda gördüğümüz gibi birbirinden kalıtım alan sınıflar üzerinde de upcasting, downcasting işlemleri yapılabilir.
         * Java upcasting işlemini dolaylı(otomatik) olarak yapar
         */

        Animal animalDog = new Dog();
        Animal animalCat = new Cat();

//      Dog dog = new Animal();

        doAnimalStuff(animalDog);
        //doAnimalStuff(animalCat);

    }

    public static void doAnimalStuff(Animal animal){

        Cat cat1 = (Cat) animal;

        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.growl();
        }else if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.mrr();
        }

        //instanceof kullanımı
    }

    /**
     *
     * Java downcasting işlemini otomatik yapmaz
     */

}
