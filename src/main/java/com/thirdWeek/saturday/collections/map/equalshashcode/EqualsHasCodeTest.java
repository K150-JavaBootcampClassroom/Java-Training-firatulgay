package com.thirdWeek.saturday.collections.map.equalshashcode;

public class EqualsHasCodeTest {
    /**
     * Hash Code: hash code programın objeleri bölmelere koymaya yarar.
     * Hashtable, hashmap gibi table yapılarını destekler.
     * iki farklı object aynı hashcode'a sahip olduğunda buna collision denir.
     * cok fazla collision sistemin performansını düşürecektir.
     * performans anlamında önemlidir.  Büyük verilerde hem aynı verye ulaşma anlamında hem de performans anlamında
     * dikkat etmek gerekir.
     * @param args
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Murat");

        Student student1 = new Student();
        student1.setName("Fırat");

        System.out.println(student.equals(student1));

        String str1 = new String("Fırat");
        String str2 = new String("Fırat");
        System.out.println(str1.equals(str2));


//        Student student = new Student();
//        student.setName("Fırat");
//        student.setSchoolName("Fırat Üni.");
//
//        Student student2 = new Student();
//        student2.setName("Fırat");
//        student2.setSchoolName("Fırat Üni.");
//
//        System.out.println(student.equals(student2));
//
//        HashSet<Student> hashSet = new HashSet<>();
//        hashSet.add(student2);
//        hashSet.add(student);
//        System.out.println(hashSet);
    }
}
