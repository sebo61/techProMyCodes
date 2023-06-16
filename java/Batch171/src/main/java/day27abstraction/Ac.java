package day27abstraction;

public interface Ac {
    public void cool();
    /*
    1)bir interfacesi bir classın parentı yapmak için "implement" keywordunu kullanırız.
    2) java parentlar class olduğunda multipil parenta izin vermez. biz bazen buna ihtiyaç duyarız.
    bu ihtiyacı gidermek için java interface adında yeni bir yaoı oluşturdu. bu yapı sayesinde coklu interface parent oluşturulur.
    3) interfacelerin içine concrete metod konulamaz. çünkü concrete metodlarda body vardır. body o metodun nasıul yapılacağını söyler.
    işin nasıl yapılacağı birçok detay içerir.
    bu child claslarda kafa karışıklığına sebep olur. jalbuki sadece yapılması gerken işi söyleyep işin nasıl yapılacağını child a bırakırsanız child classın kafa karışıklığını engellemiş olursunuz.
    4) intrfaclerdeki tüm metodlar otomatik olarak publicdir. abstracttır. ama static değildir.
    5) interfaceler concretet metod iceremezler. dolyısı ile interface içerisindeki hiçbir şey isteğe bağlı değildir.
    herşey childlar için mecburidir. bu yüzden interfacelere to do list de denir.



     */

}
