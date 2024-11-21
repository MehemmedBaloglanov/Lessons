package com.ms24finalproject.lesson7;

public class Ders0447 {
    public static void main(String[] args) {
         /*

        1'den 1000'e kadar olan sayılardan asal olanları ekrana yazdırın.

        Asal Sayı : 1'e ve kendisinden başka hiçbir sayıya bölünmeyen sayıya asal sayı denir.

        */

        for(int i = 2;i<=1000;i++){
            if(asal(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean asal(int a){
        for(int i = 2;i<a;i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}
