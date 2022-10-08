package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 4.10.2022
 **/

public class DortIslem {

  public double Topla(double sayi1, double sayi2){
    return sayi1 + sayi2;
  }
  //the method above is overloaded by the method below:
  public double Topla(double sayi1, double sayi2, double sayi3){
    return sayi1 + sayi2 + sayi3;
  }

  public double Cikar(double sayi1, double sayi2){
    return sayi1 - sayi2;
  }

  public double Carp(double sayi1, double sayi2){
    return sayi1 * sayi2;
  }

  public double Bol(double sayi1, double sayi2){
    if (sayi2 != 0) {
      return sayi1 / sayi2;
    } else {
      System.out.println("Sıfıra Bölme Yapılamaz");
      return 0;
    }
  }

}
