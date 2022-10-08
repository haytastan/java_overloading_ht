package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 4.10.2022
 **/
public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        double a = 10;
        double b = 5;
        double c = 2;
        double toplamaSonucu2 = dortIslem.Topla(a,b);
        double toplamaSonucu3 = dortIslem.Topla(a,b,c);
        double cikarmaSonucu = dortIslem.Cikar(a,b);
        double carpmaSonucu = dortIslem.Cikar(a,b);
        double bolmeSonucu = dortIslem.Bol(a,b);

        System.out.println(a + " + " + b + " = " + toplamaSonucu2);
        System.out.println(a + " + " + b + " + " + c + " = " + toplamaSonucu3);
        System.out.println(a + " - " + b + " = " + cikarmaSonucu);
        System.out.println(a + " x " + b + " = " + carpmaSonucu);
        System.out.println(a + " / " + b + " = " + bolmeSonucu);

    }
}
