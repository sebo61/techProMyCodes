package day29collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {
        Queue<String> line=new PriorityQueue<>();
        line.add("Egg");
        line.add("Milk");
        line.add("Cheese");
        line.add("Meat");
        System.out.println(line);
        /*
        Queue bir interfaces dir. bu yüzden consructor ı yoktur. Dolayısı ile obje oluştururken new keywordünden
        sonra queue yazamayız.
         Data taype ı queue olan bir object oluşturmak için
         1) LinkedList veya  2) PriorityQueue classları kullanılabilir.
         Queue oluştururken consructor olarak   PriorityQueue kullanırsak elemanlarıkendi belirleyeceğiz
         kurala göre sıralama hakkınız olur
         */


    }
}
