package suleyman.day17MultiDimesionalArray01;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class MultiDimesionalArray01 {
    /*
    Bir Arrayin elemanlarıda array olursa bu tarz arraylere multiDimesionalArray denir.
     */
    public static void main(String[] args) {
        // multiDimesionaArray nasıl oluşturulur.

        String names[][] = new String[3][2];
        names[1][0] = "P";
        names[2][1] = "Z";
        names[0][0] = "A";
        names[0][1] = "K";
        names[1][1] = "M";
        names[2][0] = "C";
        // multiDimesionalaRRAYleri yazdırmak için "deepToString()" metodunu kullanırız.
        System.out.println(Arrays.deepToString(names)); // [[A, K], [P, M], [C, Z]]

        // multiDimsional içinden specific eleman nasıl yazdırılır.

        System.out.println(names[1][1]); //M
        // multiDimsional içinden bir arrayi yazdırma
        System.out.println(Arrays.toString(names[0])); //[A, K]
        System.out.println(Arrays.toString(names[1])); //[P, M]
        // kısayoldan multiDimesional array nasıl oluşturulur?

        String student[][] = {{"ali", "kemal"}, {"cemal"}, {"ayhan", "beyhan", "seyhan"}, {"ceyhan", "kayahan"}};
        System.out.println(Arrays.deepToString(student));

        // yukarıdaki student arrayinde toplam kaç isim var?
        int sum = 0;

        for (String[] w : student) {
            sum += w.length;

        }
        System.out.println(sum); //8

        // yukarıdaki studenet arrayinde içinde "m" olan isimleri konsola yazdırımız.

        for (String[] w : student) {

            for (String t : w) {

                if (t.contains("h")) {
                    System.out.println(t);
                }
            }
        }
        // bir integer multiDi.. oluşturunuz tüm elemanların çarpımını hesaplayınız.
        int nums[][]={{5,4},{2,3,2},{7}};

        int multiple=1;
        for (int [] w: nums ) {
            for (int t :w ) {

                multiple*=t;

            }

        }
        System.out.println(multiple);

    }
}
