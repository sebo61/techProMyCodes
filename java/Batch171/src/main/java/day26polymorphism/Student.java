package day26polymorphism;

public class Student {
    // Encapsulation ==>kapsülleme
    /*
    Encapsulation nedir? Data Hiding (veri gizleme)
    Data nasıl saklanır?
    Acces modifierlarını private yaparak datayi diğer classlardan gorunmez hale getiririm. bölece datayı saklarım
      Emcapsulation yaptığımız datayı istersek diğer classlardan okuyabiliriz.
      nasıl okuruz?
      getmethod oluşturarak encapsulation edilmiş datanın değerini okuyabiliriz.

       1) get methodlar public olur.
       2) get metodun return type ı okuduğum variadla ın typeı ile ayna olur.
       3) get method bir boolean variable için oluşturulduysa ismi is ile başlar

       örnek ==>isSuccessful()
     */

    private String stdId="AC323424";
    public String stdNames="ali can";
    public int age=13;
    private double notOrt=3.13;
    private boolean isSuccessful=false;

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }
}
