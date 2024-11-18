package com.ms24finalproject.lesson4;

public class Ders0926 {
    public static void main(String[] args) {
        //String primitiv tip DEYIL
        String a = "Merhaba";
        System.out.println(a + " Hosgeldiniz..."); // Merhaba Hosgeldiniz...

        String b = "Java";
        String c = "Programlama";
        String d = "Dili";
        System.out.println(b + " " + c + " " + d);


        String m = "Merhaba ";
        int i = 35;
        String l = m + i;
        System.out.println(l);

        char p = '?';
        String q = "Merhaba Nasilsin" + p;
        System.out.println(q);


        String r = "Java "
                + "Programlama "
                + "Dili";
        System.out.println(r);


        // \t 1 tab bosluq buraxir
        // \n 1 satır aşağı yollar

        String s = "Java\tProgramlama\tDili";
        System.out.println(s);

        String t = "Java\nProgramlama\nDili";
        System.out.println(t);
    }
}
