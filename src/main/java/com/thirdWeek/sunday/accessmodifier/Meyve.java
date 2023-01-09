package com.thirdWeek.sunday.accessmodifier;

/**
 * Erişim belirleyiciler
 *  public, private, protected, deafult
 *  public: her yerden erişim var.
 *  private: sadece bulunduğu class içeirisnde erişim sağlanır.
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

//classın public işaretlenmezse kendsinden miras alınamaz.
public class Meyve {

    //protected kullanımı. sadece aynı paket içerisinden erişim sağlanır.
    // farklı paketler içerisinde kalıtım varsa çağrılabilir.
    protected int kilo;
    String adi;//friendly
    private String kind;
    public String color;


    protected void meyveOlustur(){
        System.out.println("Meyve oluştu");
        kind = "dfgdfg";
    }


    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
