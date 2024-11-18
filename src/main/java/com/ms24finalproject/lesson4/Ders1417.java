package com.ms24finalproject.lesson4;

public class Ders1417 {
    public static void main(String[] args) {
        /*Tam sayilari gosteren 4 veri tipi var
        1)byte
        2)short
        3)int
        4)long

        Bunlarin bele ayrilmasina sebeb ala bildikleri qiymetler ve yaddasda tutduqlari yerlerdir.
        byte: -128 (minimum) ve 127 (maximum) arasinda deger alir -> 8 bit yer saxlayir
        short: -32,768 (minimum) ve 32,767 (maximum) arasinda deger alir -> 16 bit yer saxlayir
        int: -2,147,483,648 (minimum) ve 2,147,483,647 (maximum) arasinda deger alir -> 32 bit yer saxliyir
        long: -9,223,372,036,854,775,808 (minimum) ve 9,223,372,036,854,775,807 (maximum) arasinda deger alir -> 64 bit yer saxliyir
         */

        int a = 4;

        byte b = 100;

        short c = 120;

        long d = 150;

        //TYPE CASTING

        //Automatic casting
        short t = 1000;
        int i = (t / 2);
        int k = t;
        System.out.println(i);
        System.out.println(k);

        //Manuel casting
        byte m = 100;
        byte n = (byte) (m / 2);
        System.out.println(n);


        //Automatic casting
        short w = 100;
        byte q = 2;
        int l = 4;
        long p = w + q + l;
        System.out.println(p);

    }
}
