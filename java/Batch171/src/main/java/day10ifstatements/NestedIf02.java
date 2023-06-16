package day10ifstatements;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
           /*
          Example 2:Kullanicidan bir ucgenin kenar uzunluklarini aliniz
                    Uc kenari birbirine esit ise "Eskenar Ucgen " yazdiriniz
                    Sadece iki kenar uzunlugu biribirine esit ise "Ikizkenar ucgen"
                    Tum kenarlari birbirinden farkli ise "Cesitkenar Ucgen" yazdiriniz        */

        Scanner input = new Scanner(System.in);
        System.out.println("Kenarları giriniz.:");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenmi = a + b > c && c > Math.abs(a - b) &&
                a + c > b && b > Math.abs(a - c) &&
                b + c > a && a > Math.abs(b - c);

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Geçerli kenar uzunluğu giriniz.:");
        } else {
            if (ucgenmi) {

                if (a == b && b == c && a == c) {
                    System.out.println("eşkenar üçgendir.");

                } else if (a == b || b == c || a == c) {
                    System.out.println("ikizkenar üşgen");

                } else {
                    System.out.println("çeşitkenar üçgen");

                }
            } else {
                System.out.println("üçgen değildir");
            }

        }

    }}