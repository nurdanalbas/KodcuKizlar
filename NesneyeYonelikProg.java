/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author NurdanPC
 */
public class NesneyeYonelikProg {

    String renk;
    int km;
    String marka;
    String model;

    public NesneyeYonelikProg(String renk, int km, String marka, String model) {

        this.renk = renk;
        this.km = km;
        this.marka = marka;
        this.model = model;
    }

    void yazdir() {
        System.out.println(renk+" rengi "+km+" km "+marka+" marka "+model+" model ");
    }
    
    public int hizlan(int hiz){
        
        this.km=hiz;
        
        for (int i = 0; i < 5; i++) {
            hiz++;
        }
        return hiz;
    }
    public static void main(String[] args) {

        NesneyeYonelikProg araba = new NesneyeYonelikProg("Turuncu", 100, "Toyota", "Auris");
        araba.yazdir();
        System.out.println(araba.hizlan(40));
        NesneyeYonelikProg araba2 = new NesneyeYonelikProg("Yeşil", 200, "Toyota", "Yaris");
        araba2.yazdir();
        NesneyeYonelikProg araba3 = new NesneyeYonelikProg("Beyaz", 250, "Nissan", "Juke");
        araba3.yazdir();
    }
}
