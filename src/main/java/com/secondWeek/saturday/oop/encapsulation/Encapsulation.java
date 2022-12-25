package com.secondWeek.saturday.oop.encapsulation;



public class Encapsulation {


    /**
     * Sarmallama olarakta bilinir.
     * . Java Encapsulation aslında java sınıfı içerisinde tanımladığımız değişkenlerimizi
     * korumak veya saklamak anlamanına gelmektedir. Tanımladığımız bir sınıf içerisindeki
     * değişkenin direk olarak değiştirilememesi,
     * bunun yerine bizim izin verdiğimiz ölçüde, metotlar aracılığıyla değiştirilmesi gerekmektedir
     * Verilerimizi dış dünyaya karşı istediğimiz şekilde işleyebilmemize olanak sağlayan yapıdır.
     *
     * Yani sınıflar dışarıya hizmet verirken iç hizmetinin saklı kalmasını sağlar.
     * @param args
     */
    public static void main(String[] args) {
        Araba araba = new Araba();
        String marka = araba.getMarka();
        araba.setKapiSayisi(4);
    }


    /**
     * Örnek: Araba classı içerisinde bulunan ve 100 adet classta kullanılan bir değişkene direkt ulaşım var.
     * Ve değişkenin adını değiştirmek istiyorum.
     *
     */

    /**
     * Bir araba tanımlarken kapı sayısını negatif girememelisin
     */

    /**
     * get/set methodları encapsulation yapmamıza yarayan özel methodlardır.
     * Kullanımına dikkat etmek gerekir.
     *
     */


    /**
     * Erişim belirleyiciler
     *  public, private, protected, deafult
     *  public: her yerden erişim var.
     *  private: sadece b ulunduğu class içeirisnde erişim sağlanır.
     *  protected: Aynı paket ve kendisini extend eden paketlerde kullanılırız. Subclasslar farklı pakette olsa dahi erişim sağlar
     *  Sınıfların da erişim belirleyicileri vardır, Üyelerinin de vardır.
     *
     */

    /**
     * Snıf erişim kontrolü
     * İki çeşittir sadece public hiçbir keyword olmayan class tanımı.
     * hiçbir keyword olmadan yapılan erişim default accessibility olarak adlandırılır
     * Sadece paket içerisindekiler erişebilir.
     */


}
