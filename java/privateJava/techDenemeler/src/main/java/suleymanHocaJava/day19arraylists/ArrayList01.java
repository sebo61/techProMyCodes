package suleyman.day19arraylists;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList01 {
    /*
    1) ayni data tipindedi çoklu dataları depolamak için Array kullanırız.
    2) Arraylerin bir negatif yönü var. içine koyacağınız eleman sayısını en başta belirtmek gereklidir.
    3) Arrayler eleman sayısında esnek değildirler. bu yüzden Java ArrayList adlı bir yapı oluşturdu.
        bu yapı eleamn sayısında esnektir. Hiç eleman koymazsanız eleaman sayısını 0 olarak ayarlar.
       1000 eleman koyarsanız eleman sayısını 1000 olarak ayarlar.
    4) "ArrayList" yerine sadece "List" de diyebiliriz.
    5) Java ArrayList leri oluşturduktan sonra Arrayleri silmedi. Çümkü; arrayler süper hızlıdır. Memoryde çoook az yer kaplar.
    6)Array'ler primitive ve reference'lari depolayabilir. Ama ArrayList'ler non-primitive data type larını depolar.
        Bu yüzden ArrayList'ler arraylerden daha çok yer kaplar.


     */
    public static void main(String[] args) {
        //ArrayList nasıl oluşturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        //ArrayList consola nasıl yazdırılır.
        System.out.println(ages); //[]
        // ArrayList'e eleman nasıl eklenir?
        //1. way
        ages.add(12);
        ages.add(24);
        ages.add(9); // add metodu elemanları giriş sırasına (insertion order) göre liste yerleştirir.
        // 2. way
        ages.add(1,99);

        System.out.println(ages); //[12, 24]
        ArrayList<Integer> price = new ArrayList<>();
        price.add(23);
        price.add(33);
        // 3. way
        ages.addAll(price); // bir listi diğer listin içine yerleştirir.
        System.out.println(ages); //[12, 99, 24, 9, 23, 33]
        //4. way
        ages.addAll(3,price);
        System.out.println(ages); //[12, 99, 24, 23, 33, 9, 23, 33]
        // ArrayList'de eleman sayısı nasıl bulunur?
        System.out.println(ages.size()); //bsize() bir List'deki eleman sayısını verir.
        // ArrayList'te specific bir eleman nasıl alınır?

       int el1= ages.get(3); // get() metodu index kullanarak istediğimiz elemanı almaya yarar.
        System.out.println(el1);
        //specific bir eleman nasıl değiştirilir.
        ages.set(6,111); //
        System.out.println(ages);  //[12, 99, 24, 23, 33, 9, 111, 33]
    }
}
