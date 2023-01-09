package com.thirdWeek.saturday.collections.map;

import java.util.HashMap;

public class HashMapYapisi {
    /**
     * HashMap key, value olarak verileri tutan yapıdır.
     * Sırasız depolanır
     */

    public static void main(String[] args) {

        HashMap<Integer, String> nameMap = new HashMap<>();

        nameMap.put(15, "Fırat");
        nameMap.put(25, "Batuhan");
        nameMap.put(25, "Murat");//aynı key değerini ekleyince sonucu ne olur?

        System.out.println(nameMap);

        /**
         * Veri alma
         */
        String value = nameMap.get(15);
        System.out.println(value);

        String value2 = nameMap.get(25);

        for (Integer key : nameMap.keySet()) {
            System.out.println("hasmap'in keyi:" + key + " value: " + nameMap.get(key));
        }


        for (String value1 : nameMap.values()){
            System.out.println(value1);
        }

//        System.out.println(value2);//sonuc?

        int size = nameMap.size();
//        System.out.println(size);//sonuc ?


        /**
         * Hashmap sonucu incele.
         */
        HashMap<Flower, String> flowerHashMap = new HashMap<>();
        flowerHashMap.put(new Flower("rose"), "Fırat" );

        String rose = flowerHashMap.get(new Flower("rose"));
        System.out.println(rose);

        /**
         * Kuyruk, Stack yapıları araştırılabilir.
         *
         */


    }

}
