package com.ms24finalproject.lesson4;

public class Ders1749 {

    public static void main(String[] args) {
        //Deyiskenler verilerin depolandigi yerdir.

        int a = 4;
        System.out.println(a);

        int b;
        b = 5;
        b = 2; //Burada b ye en sonunncu 2 menimsedildiyi ucun b nin son qiymeti 2 olur. Yeni ki hardasa b ni istifade elesen qiymeti 2 olacaq
        System.out.println(b);

        int c = 5;
        int d = 3 + 5; //Burda ikisi de toplanaraq d ye menimsedilir
        System.out.println(d);

        int e = 3;
        int f = 4;
        int g = 5;
        int h = e + f + g; //Burada toplama isleminin cemini alaraq h ye menimsedilir
        int i = e + 2 * f + g;
        System.out.println("Netice = " + h);
        System.out.println("Netice = " + i);

//        int 1murat = 12; Deyiskenlerini adlandirilmasinda basinda reqem ola bilmez


        int m = 10;
        int n = m * 2;
        int l = n - 3;
        int netice = 2 * m + n - l;
        System.out.println("Netice = " + netice);
    }
}
