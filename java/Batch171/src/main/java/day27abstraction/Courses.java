package day27abstraction;

public abstract class Courses {
    //abstraction
    public abstract void math();
    public void art(){
        System.out.println("learn art");
    }


/*
1)Eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece
    child classlarin yapmak zorunda olduklari gorevleri belirlemek icin kullaniyorsak
    "Abstraction" yapariz.
    2)Bazen parent class daki methodun bodysi hicbir child class tarafindan kullanilmaz.
    Bu durumda parenttaki methoda body yazmak hic kullanilmadigi icin mantikli degildir
    Bizde yazmayiz
    3)Body si yazilmayan method Abstract Mehod denir. Abstract ingilizcede vucutsut yada soyut demektir
    4)Methodun body sini yazmayinca java bize hata verir, bizde abstract keywordunu kullanarak
    javaya bu methodun bodyis olmayacak deriz
    5)abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz
    o yuzden classi da abtstract yapmaliyiz
    6) Parent taki method abstract ise butun child classlar o methodu override etmek zorundadir
    Bu yuzden tum childler icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir.
    7) body si olan metodlar (=concrete metod) abstract classların içine yazılabilir. absract methodlar concrete clasların içine yazılamaz.
        cıncrete metodlar child classlar tarafından override edilmek zorunda değildir.
    8) "abstract" keywıord ile metod body bir methodda aynı anda kullanılamaz.
     9) final methodlar abstract olamazlar. final methodlar override edilemezler, halbuki abstract methodlar
    override edilmek icin olusturulurlar. Bu celiskidir, bu yuzden java abstract methodlarin final olmasina musaade etmez
    10) "abstract class"larin icinde abstract methodlar olur. "abstract methodlar" bodysi olmadigindan eksik methodlar gibi
    dusunulebilir, yani abstract class icinde eksik bir yapi barindirir. Eger siz abstract classdan
    object uretirseniz bu eksiklik object e yansir, java bunu istemez cunku eksik object eksik isyapar
    buda applicationin yanlis calismasina sebep olur
    java application u korumak icin abstract classlardan object uretilmesini engellemistir
    11) "abstract class"larin constructor i vardir ama object olusturamazlar.
    12) abstract classın abstract childı veya concrete childi olabilir. eğer child abstract ise absrtact metodları override etmek zorunda
    değildir.
    13) abstract metodlar private olamazlarr. çünkü child metodlar abstraxct metodları kullanırlar. privatye olunca kullanıma kapanır.
    bu çelişkidir. bu yüzden java abstract metodların private olmasına izin vermez.
    14) classlar final olduğunda child classa sahip ollamazlar. ama bastract classlar için child class olmalıdır.
    çünkü child classlar abstract parent classdaki abstraact metodları kullanırlar. java abstraact classların final
    olmasına izin vermez.

 */
}
