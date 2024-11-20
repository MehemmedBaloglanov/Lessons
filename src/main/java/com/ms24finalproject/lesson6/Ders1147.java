package com.ms24finalproject.lesson6;

import java.util.Scanner;

public class Ders1147 {
    public static void main(String[] args) {
        /*
            break anahtar kelimesi

            Döngü herhangi bir yerde ve herhangi bir zamanda break ifadesiyle karşılaştığı zaman çalışmasını durdurur.
            Böylelikle döngü hiçbir koşula bağlı kalmadan sonlanmış olur.

            break ifadesi sadece ve sadece içinde bulunduğu döngüyü sonlandırır. Eğer iç içe döngüler varsa
            ve içteki döngüde break kullanılmışsa sadece içteki döngü sona erer.

            continue anahtar kelimesi

            Döngü herhangi bir yerde ve herhangi bir zamanda continue ifadesiyle karşılaştığı zaman geri kalan
            işlemlerini yapmadan direk döngü bloğunun başına döner.

        */

        int i = 0;
        while (i <20){
            if(i==10){
                break;
            }
            System.out.println("i="+i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);

        while (true){

            int islem = scanner.nextInt();

            if(islem == -1){
                System.out.println("Programdan cikiliyor...");
                break;
            }
            System.out.println("Islem: "+islem);
        }


        for(int a = 0; a <10;a++){
            if(a==2 || a==5){
                continue;
            }
            System.out.println("a= " + a);
        }


        int f = 0;
        while (f<10){
            if(f==2 || f==5){
                continue;
            }
            System.out.println("f= " + f);
            f++;
        }
    }
}
