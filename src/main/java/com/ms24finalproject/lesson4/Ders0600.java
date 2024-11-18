package com.ms24finalproject.lesson4;

public class Ders0600 {
    public static void main(String[] args) {
        /* Karakterleri gostermek icin char veri tipi kullaniliyor
           True ve False u icerisinde saklayan veri tipi ise booleandir
         */

        //char
        char a = 'A';
        char b = '?';
//        char c = '23'; Bele yazmaq olmaz cunki 1 yox 2 simvol saxliyib. char sadece 1 simvol saxlayir


        char c = 1000; //Bu cur yazmaq mumkundur cunki sag terefde yazilan 1000 ASCII cedvelinde hansisa bir simvolu temsil edir ve onu qaytarir
        System.out.println(c); //8

        char r = '\u0152'; //Bu cur yazmaq ise bu UNICODE table da olan qarsiligi getirir
        System.out.println(r);

        //boolean
        boolean e = true;
        boolean f = false;
        System.out.println(e); //true
        System.out.println(f); //false

    }
}
